package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.spring.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/kodewala/spring/beans.xml");
        
        Student student = (Student) context.getBean("std");
        
        student.setId(1234);
        student.setName("abhishek");
        student.setCourse("B.Tech");
        
        System.out.println(student);
    }
}
