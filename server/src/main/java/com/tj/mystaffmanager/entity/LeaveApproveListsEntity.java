package com.tj.mystaffmanager.entity;

import lombok.Data;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.entity
 * @NAME: LeaveApproveListsEntity
 * @USER: GOD_T
 * @DATE: 2020/5/2
 * @TIME: 16:43
 **/
@Data
public class LeaveApproveListsEntity {
    private Integer approveId;
    private String applicateNum;
    private String applicateName;
    private String applicateDate;
    private String staffNum;
    private String leaveType;
    private String startDate;
    private String endDate;
    private String applicateReason;
}
