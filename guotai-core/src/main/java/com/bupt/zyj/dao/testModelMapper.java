package com.bupt.zyj.dao;

import com.bupt.zyj.model.testModel;


public interface testModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(testModel record);

    int insertSelective(testModel record);

    testModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(testModel record);

    int updateByPrimaryKey(testModel record);
}