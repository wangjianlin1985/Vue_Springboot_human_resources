package com.tj.mystaffmanager.serviceImpl;

import com.tj.mystaffmanager.entity.NewsEntity;
import com.tj.mystaffmanager.mapper.LoginMapper;
import com.tj.mystaffmanager.mapper.NewsMapper;
import com.tj.mystaffmanager.service.LoginService;
import com.tj.mystaffmanager.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.serviceImpl
 * @NAME: NewsServiceImpl
 * @USER: GOD_T
 * @DATE: 2020/2/8
 * @TIME: 13:34
 **/
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<NewsEntity> getAllNews() {
        return newsMapper.getAllNews();
    }

    @Override
    public void insertNewItem(NewsEntity entity) {
        newsMapper.insertNewItem(entity);
    }

    @Override
    public void deleteNewsById(Integer newsId) {
        newsMapper.deleteNewsById(newsId);
    }
}
