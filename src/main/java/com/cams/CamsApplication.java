package com.cams;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.cams.dao.mapper")
public class CamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamsApplication.class, args);
	}

}
