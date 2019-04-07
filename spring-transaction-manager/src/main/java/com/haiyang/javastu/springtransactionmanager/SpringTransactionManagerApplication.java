package com.haiyang.javastu.springtransactionmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 此处要将DataSourceAutoConfiguration类排除掉，否则会出现循环依赖的异常
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@MapperScan("com.haiyang.javastu.springtransactionmanager.dao")
public class SpringTransactionManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTransactionManagerApplication.class, args);
	}

}
