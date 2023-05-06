package com.tj.mystaffmanager.controller;

import com.tj.mystaffmanager.entity.LeaveApproveEntity;
import com.tj.mystaffmanager.entity.NewsEntity;
import com.tj.mystaffmanager.entity.StaffEntity;
import com.tj.mystaffmanager.entity.UserEntity;
import com.tj.mystaffmanager.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.controller
 * @NAME: StaffController
 * @USER: GOD_T
 * @DATE: 2020/5/1
 * @TIME: 21:51
 **/
@RestController
public class StaffController {
    @Autowired
    private StaffService staffService;

    /**
     * 获取全部员工信息
     *
     * @return 员工信息list
     */
    @GetMapping("/api/HomePage/staffInfo")
    public List<StaffEntity> getNewsInfo() {
        return staffService.getAllStaff();
    }

    /**
     * 新增员工
     *
     * @param entity 前端参数
     * @return 状态码
     */
    @PostMapping("/api/StaffRoster/addstaff")
    public String insertIntoApproveDone(@RequestBody StaffEntity entity) {
        if (entity == null) {
            return "400";
        } else {
            staffService.insertStaff(entity);
            return "200";
        }
    }

    /**
     * 修改员工
     *
     * @param entity 前端参数
     * @return 状态码
     */
    @PostMapping("/api/StaffRoster/updatestaff")
    public String updateSelectedStaff(@RequestBody StaffEntity entity) {
        if (entity == null) {
            return "400";
        } else {
            staffService.updateSelectedStaff(entity);
            return "200";
        }
    }

    /**
     * 查询权限列表
     *
     * @return 列表
     */
    @GetMapping("/api/Permissions/List")
    public List<UserEntity> getApproveLeaveDone() {
        return staffService.getAllPermission();
    }
}
