package com.jeeweixin;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
* @author QiCong
* @version 2021年4月10日
* 
**/
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.jeeweixin"})
@MapperScan("com.jeeweixin.dao")
public class Application {
	
	static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		logger.info("start application jeeweixin ...");
		SpringApplication.run(Application.class, args);
	}
	
}
