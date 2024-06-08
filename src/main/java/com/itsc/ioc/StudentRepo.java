package com.itsc.ioc;

import java.sql.*;

public class StudentRepo {

	public static void main(String[] args) {
//			 public void createDBAndTable() {  }
//			 public void insertIntoTable(Student student) { 
//			}
//		}
		String driver = "com.mysql.cj,jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";
		String username = "root";
		String password = "mysql@4581!";
		String databaseName = "StudentsDB";
		String tableName = "students";
		
		Connection connection = null;
		Statement statement = null;
		
		try {
			
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			statement = connection.createStatement();
			
			String createDatabase = "CREATE DATABASE " + databaseName;
			String database = "USE " + databaseName;
			String createTable = "CREATE TABLE " + tableName + " (id int auto_increment primary key, name varchar(255), last_name varchar(255), email varchar(255));";
			statement.executeUpdate(createDatabase);
			statement.executeUpdate(database);
			statement.executeUpdate(createTable);
			System.out.println("Database created");
 
			String[] datas = {"INSERT INTO " + tableName + " (id, name, email) VALUE ('4581', 'Abdulfeta Sani', 'abdulfetasani128@gmail.com');"};
			
			statement.executeUpdate(database);
			
			for (String data: datas) {
				statement.executeUpdate(data);
			}
			
			System.out.println("Data inserted successfully!");
		
		} catch (Exception SQLException) {
			SQLException.printStackTrace();
			}
	}
}
