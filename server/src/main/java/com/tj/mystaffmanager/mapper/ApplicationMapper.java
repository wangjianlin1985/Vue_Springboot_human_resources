package com.tj.mystaffmanager.mapper;

import com.tj.mystaffmanager.entity.ApplicationEntity;
import com.tj.mystaffmanager.entity.LeaveApproveEntity;
import com.tj.mystaffmanager.entity.LeaveApproveListsEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.mapper
 * @NAME: ApplicationMapper
 * @USER: GOD_T
 * @DATE: 2020/2/8
 * @TIME: 13:28
 **/
@Repository
public interface ApplicationMapper {
    /**
     * 新申请添加至未完成表
     *
     * @param entity 申请内容
     */
    void newLeaveAddUndone(ApplicationEntity entity);

    /**
     * 查询未完成表
     *
     * @return 未完成列表
     */
    List<ApplicationEntity> getAllUndone();

    /**
     * 根据申请id删除
     *
     * @param applicateId 申请号
     */
    void deleteSelectedById(@Param("applicateId") Integer applicateId);

    /**
     * 请假申请添加至审批表
     *
     * @param entity 审批内容
     */
    void insertIntoApprove(LeaveApproveEntity entity);

    /**
     * 请假审批表
     *
     * @return 表内容
     */
    List<LeaveApproveEntity> getApproveLeaveLists();

    /**
     * 取消申请后删除对应的审批表内容
     *
     * @param applicateDate 申请日
     */
    void deleteByDate(@Param("applicateDate") String applicateDate);

    /**
     * 同意或驳回请假审批(删除该审批)
     *
     * @param approveId
     */
    void deleteLeaveApproveById(@Param("approveId") Integer approveId);

    /**
     * 同意或驳回请假审批后，添加到已完成申请表中
     *
     * @param entity 同意或驳回的申请信息
     */
    void insertIntoDone(ApplicationEntity entity);

    /**
     * 查询完成表
     *
     * @return 完成列表
     */
    List<ApplicationEntity> getAllDone();

    /**
     * 删除相应的未完成信息
     *
     * @param applicateDate 申请日
     */
    void deleteByApplicateDate(@Param("applicateDate") String applicateDate);

    /**
     * 同意或驳回请假审批后，添加到已完成审批表中
     *
     * @param entity e
     */
    void insertIntoApproveDone(LeaveApproveEntity entity);

    /**
     * 审批完成表
     *
     * @return 审批完成表
     */
    List<LeaveApproveEntity> getApproveLeaveDone();
}
