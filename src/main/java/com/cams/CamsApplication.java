package com.cams;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.cams.dao.mapper")
@ComponentScan(basePackages= {"com.cams", "org.n3r.idworker"})
public class CamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamsApplication.class, args);
	}

}
