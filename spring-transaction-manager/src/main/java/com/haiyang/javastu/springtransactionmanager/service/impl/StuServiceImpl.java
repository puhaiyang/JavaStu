package com.haiyang.javastu.springtransactionmanager.service.impl;

import com.haiyang.javastu.springtransactionmanager.dao.StuDao;
import com.haiyang.javastu.springtransactionmanager.service.StuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class StuServiceImpl implements StuService {

    @Resource
    private StuDao stuDao;

    @Override
    public List<Map<String, Object>> getStuInfo(Integer stuId) {
        return stuDao.getStuInfoById(stuId);
    }
}
