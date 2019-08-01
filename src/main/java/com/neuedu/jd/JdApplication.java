package com.neuedu.jd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan("com.neuedu.jd")//扫描所有控制器（不带.Controller就把控制器和Service类都扫描了）
@MapperScan("com.neuedu.jd.model.mapper")//扫描Mapper接口
@EnableTransactionManagement//支持事务（Service层还得加注解）
public class JdApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdApplication.class, args);
	}

}
