package com.itsc.ioc.lab_exam;

import java.sql.*;

public class StudentRepo {
    private String url = "jdbc:mysql://localhost:3306/";
    private String user = "root";
    private String password = "mysql@4581!";

    public void createDBAndTable() {
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            String sqlCreateDB = "CREATE DATABASE IF NOT EXISTS StudentsDB";
            statement.executeUpdate(sqlCreateDB);

            String sqlUseDB = "USE StudentsDB";
            statement.executeUpdate(sqlUseDB);

            String sqlCreateTable = "CREATE TABLE IF NOT EXISTS Student (" + "id INT PRIMARY KEY AUTO_INCREMENT, " + "name VARCHAR(50), " + "email VARCHAR(50))";
            statement.executeUpdate(sqlCreateTable);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertIntoTable(Student student) {
        try (Connection connection = DriverManager.getConnection(url + "LabExamDB", user, password);
             Statement statement = connection.createStatement()) {

            String sqlInsert = "INSERT INTO Student (name, email) VALUES ('" + student.getName() + "', '" + student.getEmail() + "')";
            statement.executeUpdate(sqlInsert);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
