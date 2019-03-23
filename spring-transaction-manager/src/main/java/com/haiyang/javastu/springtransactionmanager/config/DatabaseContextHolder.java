package com.haiyang.javastu.springtransactionmanager.config;

import com.haiyang.javastu.springtransactionmanager.enums.DatabaseType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatabaseContextHolder {
    private static Logger logger = LoggerFactory.getLogger(DatabaseContextHolder.class);
    private static final ThreadLocal<DatabaseType> contextHolder = new ThreadLocal<>();

    public static void setDatabaseType(DatabaseType type) {
        contextHolder.set(type);
        logger.info("setDatabaseType value:{}  thread:{}", type.toString(), Thread.currentThread().toString());
    }

    public static DatabaseType getDatabaseType() {
        logger.info("getDatabaseType value:{} thread:{}", contextHolder.get(), Thread.currentThread().toString());
        return contextHolder.get();
    }


}
