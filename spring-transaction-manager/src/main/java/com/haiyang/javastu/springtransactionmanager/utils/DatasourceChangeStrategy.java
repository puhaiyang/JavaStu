package com.haiyang.javastu.springtransactionmanager.utils;

import com.haiyang.javastu.springtransactionmanager.config.DatabaseContextHolder;
import com.haiyang.javastu.springtransactionmanager.enums.DatabaseType;

public class DatasourceChangeStrategy {
    /**
     * 如果必要的话，改变数据源
     */
    public static void changeDatabaseIfNecessary(Integer stuId) {
        if (stuId != null) {
            if (stuId.equals(1) || stuId.equals(2)) {
                DatabaseContextHolder.setDatabaseType(DatabaseType.mytestdb);
            } else {
                DatabaseContextHolder.setDatabaseType(DatabaseType.mytestdb2);
            }
        }
    }
}
