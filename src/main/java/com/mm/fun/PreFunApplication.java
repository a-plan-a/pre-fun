package com.mm.fun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mm.fun.bean")
public class PreFunApplication {

	public static void main(String[] args) {
		SpringApplication.run(PreFunApplication.class, args);
	}
}
