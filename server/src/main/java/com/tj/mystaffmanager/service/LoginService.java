package com.tj.mystaffmanager.service;

import com.tj.mystaffmanager.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.service
 * @NAME: LoginService
 * @USER: GOD_T
 * @DATE: 2020/2/8
 * @TIME: 13:34
 **/
public interface LoginService {
    int getCountByLogin(int staffNum, String password);
}
