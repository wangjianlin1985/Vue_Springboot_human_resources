package com.tj.mystaffmanager.mapper;

import com.tj.mystaffmanager.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.mapper
 * @NAME: LoginMapper
 * @USER: GOD_T
 * @DATE: 2020/2/8
 * @TIME: 13:28
 **/
@Repository
public interface LoginMapper {
    int getCountByLogin(@Param("staffNum") int staffNum, @Param("password") String password);
}
