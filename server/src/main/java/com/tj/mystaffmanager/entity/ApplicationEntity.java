package com.tj.mystaffmanager.entity;

import lombok.Data;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.entity
 * @NAME: ApplicationEntity
 * @USER: GOD_T
 * @DATE: 2020/5/2
 * @TIME: 14:39
 **/
@Data
public class ApplicationEntity {
    private Integer applicateId;
    private String applicateNum;
    private String applicateName;
    private String applicateDate;
    private String applicatePerson;
    private String doneConditions;
    private String applicateReason;

}
