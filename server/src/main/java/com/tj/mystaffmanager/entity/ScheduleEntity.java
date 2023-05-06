package com.tj.mystaffmanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.entity
 * @NAME: ScheduleEntity
 * @USER: GOD_T
 * @DATE: 2020/4/19
 * @TIME: 20:16
 **/
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleEntity {
    private Integer scheduleId;
    private Integer isDone;
    private String doneTime;
    private String text;

}
