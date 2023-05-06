package com.tj.mystaffmanager.serviceImpl;

import com.tj.mystaffmanager.entity.StaffEntity;
import com.tj.mystaffmanager.entity.UserEntity;
import com.tj.mystaffmanager.mapper.StaffMapper;
import com.tj.mystaffmanager.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.serviceImpl
 * @NAME: StaffServiceImpl
 * @USER: GOD_T
 * @DATE: 2020/5/1
 * @TIME: 21:49
 **/
@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffMapper staffMapper;

    @Override
    public List<StaffEntity> getAllStaff() {
        return staffMapper.getAllStaff();
    }

    @Override
    public void insertStaff(StaffEntity entity) {
        staffMapper.insertStaff(entity);
    }

    @Override
    public void updateSelectedStaff(StaffEntity entity) {
        staffMapper.updateSelectedStaff(entity);
    }

    @Override
    public List<UserEntity> getAllPermission() {
        return staffMapper.getAllPermission();
    }
}
