package com.fox.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * spring boot application入口
 * @author miaoxy
 *
 */
@Configuration    //当前文件是配置文件
@SpringBootApplication
@PropertySource(value= {"classpath:application.properties", "classpath:jdbc.properties", "classpath:redis.properties"
		, "classpath:log4j.properties"})  //配置加载的properties文件
@ComponentScan(basePackages= {"com.fox"})  //配置扫描包

public class FoxApplication {
	
//	@Value("${jdbc.url}")
//	private String jdbcUrl;
//	
//	@Value("${jdbc.driverClassName}")
//	private String jdbcDriverClassName;
//	
//	@Value("${jdbc.username}")
//	private String jdbcUsername;
//	
//	@Value("${jdbc.password}")
//	private String jdbcPassword;
//	
//	
//	/**
//	 * 配置数据源
//	 * @return
//	 */
//	@Bean(destroyMethod = "close")
//	public DataSource dataSource() {
//		//具体使用哪个数据源 
//		
//		return null;
//	}
	
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(FoxApplication.class, args);
		
		
		
	}
	
}
