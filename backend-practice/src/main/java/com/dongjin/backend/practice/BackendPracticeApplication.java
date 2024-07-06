package com.dongjin.backend.practice;

import java.sql.Connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dongjin.backend.practice.repository.PGDataSource;

@SpringBootApplication
public class BackendPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendPracticeApplication.class, args);
		System.out.println("hello world");
		
//		try {
//
//			Connection conn = PGDataSource.createConnection();
//			System.out.println("connection made!");
//			System.out.println(conn);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
	}

}
