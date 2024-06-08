package com.itsc.ioc.lab_exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher_class {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentRepo studentRepo = (StudentRepo) context.getBean("studentRepo");

        studentRepo.createDBAndTable();

        Student student = new Student(1, "Abdulfeta Sani", "abdulfetasani128@gmail.com");
        studentRepo.insertIntoTable(student);
    }
}
