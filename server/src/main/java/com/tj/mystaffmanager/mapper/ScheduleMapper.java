package com.tj.mystaffmanager.mapper;

import com.tj.mystaffmanager.entity.ScheduleEntity;
import com.tj.mystaffmanager.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.mapper
 * @NAME: ScheduleMapper
 * @USER: GOD_T
 * @DATE: 2020/4/19
 * @TIME: 20:15
 **/
@Repository
public interface ScheduleMapper {
    /**
     * 获取全部待办事项
     *
     * @return 待办事项list
     */
    List<ScheduleEntity> getAllScheduleInfo();

    /**
     * 添加待办事项
     *
     * @param entity 待办事项inDto
     */
    void addScheduleInfo(ScheduleEntity entity);

    /**
     * 删除待办事项
     * @param text 待办事项内容
     */
    void deleteScheduleInfoByText(@Param("text")String text);

    /**
     * 修改待办事项
     * @param entity 修改后内容
     */
    void updateSchedule(ScheduleEntity entity);

    /**
     * 获取登录用户信息
     * @param staffId 登录用户id
     */
    UserEntity getUserInfoById(@Param("staffId")Integer staffId);
}
