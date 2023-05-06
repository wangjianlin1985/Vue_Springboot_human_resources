package com.tj.mystaffmanager.controller;

import com.tj.mystaffmanager.entity.ScheduleDeleteEntity;
import com.tj.mystaffmanager.entity.ScheduleEntity;
import com.tj.mystaffmanager.entity.UserEntity;
import com.tj.mystaffmanager.service.ScheduleService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.controller
 * @NAME: ScheduleController
 * @USER: GOD_T
 * @DATE: 2020/4/19
 * @TIME: 20:25
 **/
@RestController
@Slf4j
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    /**
     * 查询所有待办事项
     *
     * @return 待办事项list
     */
    @GetMapping("/api/HomePage")
    public List<ScheduleEntity> getScheduleInfo() {
        return scheduleService.getAllScheduleInfo();
    }

    /**
     * 获取登录用户信息
     *
     * @return 登录用户info
     */
    @GetMapping("/api/HomePage/UserInfo")
    public UserEntity getUserInfo(@RequestParam("staffNum") int staffNum) {
        return scheduleService.getUserInfoById(staffNum);
    }

    /**
     * 添加待办事项
     *
     * @param scheduleEntity 前端的待办事项数据
     * @return 状态码
     */
    @PostMapping("/api/HomePage/add")
    public String addScheduleItem(@RequestBody ScheduleEntity scheduleEntity) {
        if (scheduleEntity.getText() == null) {
            return "400";
        } else {
            scheduleService.addScheduleInfo(scheduleEntity);
            return "200";
        }

    }

    /**
     * 删除待办事项
     *
     * @param entity 待办事项内容
     * @return 状态码
     */
    @PostMapping("/api/HomePage/delete")
    public String deleteScheduleItem(@RequestBody ScheduleDeleteEntity entity) {
        if (entity == null) {
            return "400";
        } else {
            scheduleService.deleteScheduleInfoByText(entity.getText());
            return "200";
        }
    }

    /**
     * 修改待办事项
     *
     * @param entity 修改后待办事项内容
     * @return 状态码
     */
    @PostMapping("/api/HomePage/update")
    public String updateScheduleItem(@RequestBody ScheduleEntity entity) {
        if (entity == null) {
            return "400";
        } else {
            scheduleService.updateSchedule(entity);
            return "200";
        }
    }
}
