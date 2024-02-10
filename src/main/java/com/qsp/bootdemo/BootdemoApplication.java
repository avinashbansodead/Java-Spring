package com.qsp.bootdemo;

import java.util.List;

import org.hibernate.boot.model.relational.Database;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.bootdemo.dto.Student;

import jakarta.persistence.Entity;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,scanBasePackages="com.qsp.bootdemo.controller")
 @SpringBootApplication(scanBasePackages="com.qsp.bootdemo.controller")
@EntityScan(basePackages="com.example.bootdemo.dto")
@EnableJpaRepositories(basePackages="com.example.bootdemo.repository")
public class BootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootdemoApplication.class, args);
		
		
	}

}
