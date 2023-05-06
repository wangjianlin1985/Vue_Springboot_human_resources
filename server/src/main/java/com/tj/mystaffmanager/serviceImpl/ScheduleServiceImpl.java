package com.tj.mystaffmanager.serviceImpl;

import com.tj.mystaffmanager.entity.ScheduleEntity;
import com.tj.mystaffmanager.entity.UserEntity;
import com.tj.mystaffmanager.mapper.LoginMapper;
import com.tj.mystaffmanager.mapper.ScheduleMapper;
import com.tj.mystaffmanager.service.LoginService;
import com.tj.mystaffmanager.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.serviceImpl
 * @NAME: LoginServiceImpl
 * @USER: GOD_T
 * @DATE: 2020/2/8
 * @TIME: 13:34
 **/
@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    public List<ScheduleEntity> getAllScheduleInfo() {
        return scheduleMapper.getAllScheduleInfo();
    }

    @Override
    public void addScheduleInfo(ScheduleEntity entity) {
        scheduleMapper.addScheduleInfo(entity);
    }

    @Override
    public void deleteScheduleInfoByText(String text) {
        scheduleMapper.deleteScheduleInfoByText(text);
    }

    @Override
    public void updateSchedule(ScheduleEntity entity) {
        scheduleMapper.updateSchedule(entity);
    }

    @Override
    public UserEntity getUserInfoById(Integer staffId) {
        return scheduleMapper.getUserInfoById(staffId);
    }
}
