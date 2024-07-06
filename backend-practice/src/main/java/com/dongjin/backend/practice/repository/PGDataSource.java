package com.dongjin.backend.practice.repository;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.postgresql.ds.PGSimpleDataSource;

public class PGDataSource {
	
//	public static Connection createConnection() throws Exception {
//		
//		DataSource dataSource = createDataSource();
//		Connection conn = dataSource.getConnection();
//		
//		return conn;
//	}
	private static DataSource createDataSource() {
		
		final String host = "localhost";
		final String port = "5432";
		final String dbName = "javapracusers";
		final String user = "postgres";
		final String password = "sdj20041229";
		
		final String url =
			String.format("jdbc:postgresql://%s:%s/%s?user=%s&password=%s", host, port, dbName, user, password);
		System.out.println(url);
		final PGSimpleDataSource dataSource = new PGSimpleDataSource();
		dataSource.setUrl(url);
		return dataSource;
	}
}
