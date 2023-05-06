package com.tj.mystaffmanager.entity;

import lombok.Data;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.entity
 * @NAME: LeaveApproveEntity
 * @USER: GOD_T
 * @DATE: 2020/5/2
 * @TIME: 16:43
 **/
@Data
public class LeaveApproveEntity {
    private Integer approveId;
    private String applicateNum;
    private String staffNum;
    private String leaveType;
    private String startDate;
    private String endDate;
    private String applicateReason;
    private String staffName;
    private String applicateDate;
    private String applicateType;
}
