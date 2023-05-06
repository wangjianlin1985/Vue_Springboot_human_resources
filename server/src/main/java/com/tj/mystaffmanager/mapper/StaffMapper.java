package com.tj.mystaffmanager.mapper;

import com.tj.mystaffmanager.entity.StaffEntity;
import com.tj.mystaffmanager.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.mapper
 * @NAME: StaffMapper
 * @USER: GOD_T
 * @DATE: 2020/2/8
 * @TIME: 13:28
 **/
@Repository
public interface StaffMapper {
    /**
     * 获取全部员工信息
     *
     * @return 员工信息表
     */
    List<StaffEntity> getAllStaff();

    /**
     * 新增员工
     * @param entity 源
     */
    void insertStaff(StaffEntity entity);

    /**
     * 修改员工信息
     * @param entity 源
     */
    void updateSelectedStaff(StaffEntity entity);

    /**
     * 查询权限列表
     * @return yuan
     */
    List<UserEntity> getAllPermission();
}
