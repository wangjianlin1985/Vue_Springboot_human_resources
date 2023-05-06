package com.tj.mystaffmanager.controller;

import com.tj.mystaffmanager.entity.UserEntity;
import com.tj.mystaffmanager.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LoginController {
    @Autowired
    private LoginService loginService;

    /**
     * 验证登录信息
     * @param userEntity 前端参数
     * @return 状态码
     */
    @PostMapping("/api/login")
    public String validateLoginInfo(@RequestBody UserEntity userEntity) {
        log.info(userEntity.toString());
        int count = loginService.getCountByLogin(userEntity.getStaffNum(), userEntity.getPassword());
        if (count > 0) {
            return "200";
        } else {
            return "400";
        }
    }
}
