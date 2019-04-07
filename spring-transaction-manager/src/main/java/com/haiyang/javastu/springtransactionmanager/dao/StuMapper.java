package com.haiyang.javastu.springtransactionmanager.dao;

import org.apache.ibatis.annotations.Select;

public interface StuMapper {
    @Select("select id from stu where name=#{name}")
    Integer getStuInfoByName(String name);
}
