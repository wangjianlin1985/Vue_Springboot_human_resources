package com.tj.mystaffmanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    private Integer staffId;
    private Integer staffNum;
    private String staffName;
    private String roleName;
    private String permisMark;
    private String password;
    private String createdTime;

    public UserEntity(String staffName, String roleName) {
        this.staffName = staffName;
        this.roleName = roleName;
    }

}
