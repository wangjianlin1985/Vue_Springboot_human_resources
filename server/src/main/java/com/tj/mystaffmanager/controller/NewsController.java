package com.tj.mystaffmanager.controller;

import com.tj.mystaffmanager.entity.NewsEntity;
import com.tj.mystaffmanager.service.NewsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class NewsController {
    @Autowired
    private NewsService newsService;

    /**
     * 获取公告信息
     *
     * @return 公告list
     */
    @GetMapping("/api/HomePage/newsInfo")
    public List<NewsEntity> getNewsInfo() {
        return newsService.getAllNews();
    }

    /**
     * 发布公告
     *
     * @param entity 前端参数
     * @return 状态码
     */
    @PostMapping("/api/News/issueNews")
    public String insertIntoApproveDone(@RequestBody NewsEntity entity) {
        if (entity == null) {
            return "400";
        } else {
            newsService.insertNewItem(entity);
            return "200";
        }
    }

    /**
     * 删除未完成表对应索引数据
     *
     * @return 申请号
     */
    @GetMapping("/api/News/deleteNews")
    public String deleteNewsById(@RequestParam("newsId") Integer newsId) {
        if (newsId == null) {
            return "400";
        } else {
            newsService.deleteNewsById(newsId);
            return "200";
        }
    }
}
