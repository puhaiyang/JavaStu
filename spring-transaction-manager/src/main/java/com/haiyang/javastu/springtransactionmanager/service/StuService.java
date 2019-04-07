package com.haiyang.javastu.springtransactionmanager.service;

import java.util.List;
import java.util.Map;

public interface StuService {
    /**
     * get stuInfo
     *
     * @param stuId student id
     * @return result
     */
    List<Map<String, Object>> getStuInfo(Integer stuId);

    /**
     * @param name name
     */
    Integer getStuInfoByName(String name);
}
