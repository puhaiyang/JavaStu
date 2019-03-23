package com.haiyang.javastu.springtransactionmanager.controller;

import com.haiyang.javastu.springtransactionmanager.config.DatabaseContextHolder;
import com.haiyang.javastu.springtransactionmanager.enums.DatabaseType;
import com.haiyang.javastu.springtransactionmanager.service.StuService;
import com.haiyang.javastu.springtransactionmanager.utils.DatasourceChangeStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequestMapping(value = "/hello")
@RestController
public class HelloContoller {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StuService stuService;


    @GetMapping(value = "student/{stuId}")
    public String hello(@PathVariable(value = "stuId") Integer stuId) {
//        DatasourceChangeStrategy.changeDatabaseIfNecessary(stuId);
        List<Map<String, Object>> stuList = stuService.getStuInfo(stuId);
        logger.info("stuId:{} result:{}", stuId, stuList.toString());
        return stuList.toString();
    }
}
