package com.tj.mystaffmanager.entity;

import lombok.Data;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.entity
 * @NAME: StaffEntity
 * @USER: GOD_T
 * @DATE: 2020/5/1
 * @TIME: 21:45
 **/
@Data
public class StaffEntity {
    private Integer staffId;
    private String StaffNum;
    private String staffName;
    private String staffPart;
    private String entryDate;
    private String cardType;
    private String cardNum;
    private String phoneNum;
    private String workType;
}
