package com.tj.mystaffmanager.mapper;

import com.tj.mystaffmanager.entity.NewsEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import sun.rmi.runtime.NewThreadAction;

import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.mapper
 * @NAME: NewsMapper
 * @USER: GOD_T
 * @DATE: 2020/2/8
 * @TIME: 13:28
 **/
@Repository
public interface NewsMapper {
    /**
     * 获取公告列表
     * @return 公告列表
     */
    List<NewsEntity> getAllNews();

    /**
     * 发布公告
     * @param entity 源
     */
    void insertNewItem(NewsEntity entity);

    /**
     * 删除历史公告
     * @param newsId id
     */
    void deleteNewsById(@Param("newsId")Integer newsId);
}
