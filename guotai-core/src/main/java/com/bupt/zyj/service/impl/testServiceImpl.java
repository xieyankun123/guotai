package com.bupt.zyj.service.impl;

import com.bupt.zyj.dao.testModelMapper;
import com.bupt.zyj.model.testModel;
import com.bupt.zyj.service.testService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class testServiceImpl implements testService {
    @Resource
    private testModelMapper testModelMapper;
    @Override
    public testModel getAll() {
        return testModelMapper.selectByPrimaryKey(1);
    }
}
