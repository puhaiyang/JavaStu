package com.haiyang.javastu.springtransactionmanager.dao;

import com.haiyang.javastu.springtransactionmanager.config.DynamicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class StuDao {

//    @Autowired
//    @Qualifier(value = "primaryJdbcTemplate")
//    private JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier(value = "dynamicDataSource")
    private DynamicDataSource dataSource;


    public List<Map<String, Object>> getStuInfoById(Integer id) {
        String sql = "select * from stu where id = ?";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate.queryForList(sql, id);
//        return jdbcTemplate.queryForList(sql, id);
    }
}
