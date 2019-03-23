package com.haiyang.javastu.springtransactionmanager.service.impl;

import com.haiyang.javastu.springtransactionmanager.config.DatabaseContextHolder;
import com.haiyang.javastu.springtransactionmanager.dao.StuDao;
import com.haiyang.javastu.springtransactionmanager.enums.DatabaseType;
import com.haiyang.javastu.springtransactionmanager.service.StuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class StuServiceImpl implements StuService {

    @Resource
    private StuDao stuDao;

    //加入注解，开启事物
    @Transactional
    @Override
    public List<Map<String, Object>> getStuInfo(Integer stuId) {
        if (stuId != null) {
            if (stuId.equals(1) || stuId.equals(2)) {
                DatabaseContextHolder.setDatabaseType(DatabaseType.mytestdb);
            } else {
                DatabaseContextHolder.setDatabaseType(DatabaseType.mytestdb2);
            }
        }
        return stuDao.getStuInfoById(stuId);
    }
}
