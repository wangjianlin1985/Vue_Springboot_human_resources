package com.tj.mystaffmanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class NewsEntity {
    private Integer newsId;
    private String newsType;
    private String newsContent;
    private String newsTime;
}
