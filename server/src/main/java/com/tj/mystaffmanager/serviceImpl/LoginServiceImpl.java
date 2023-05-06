package com.tj.mystaffmanager.serviceImpl;

import com.tj.mystaffmanager.entity.UserEntity;
import com.tj.mystaffmanager.mapper.LoginMapper;
import com.tj.mystaffmanager.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.serviceImpl
 * @NAME: LoginServiceImpl
 * @USER: GOD_T
 * @DATE: 2020/2/8
 * @TIME: 13:34
 **/
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public int getCountByLogin(int staffNum, String password) {
        return loginMapper.getCountByLogin(staffNum, password);
    }
}
