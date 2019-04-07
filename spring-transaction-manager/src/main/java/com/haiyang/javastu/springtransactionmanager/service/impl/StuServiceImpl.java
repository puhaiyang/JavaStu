package com.haiyang.javastu.springtransactionmanager.service.impl;

import com.haiyang.javastu.springtransactionmanager.config.DatabaseContextHolder;
import com.haiyang.javastu.springtransactionmanager.dao.StuDao;
import com.haiyang.javastu.springtransactionmanager.dao.StuMapper;
import com.haiyang.javastu.springtransactionmanager.enums.DatabaseType;
import com.haiyang.javastu.springtransactionmanager.service.StuService;
import com.haiyang.javastu.springtransactionmanager.utils.DatasourceChangeStrategy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class StuServiceImpl implements StuService {

    @Resource
    private StuDao stuDao;
    @Resource
    private StuMapper stuMapper;

    //加入注解，开启事物
    @Transactional
    @Override
    public List<Map<String, Object>> getStuInfo(Integer stuId) {
        DatasourceChangeStrategy.changeDatabaseIfNecessary(stuId);
        return stuDao.getStuInfoById(stuId);
    }

    @Override
    public Integer getStuInfoByName(String name) {
        return stuMapper.getStuInfoByName(name);
    }
}
