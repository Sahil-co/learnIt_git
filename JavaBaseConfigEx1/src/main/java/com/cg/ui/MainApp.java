package com.cg.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.config.AppConfig;
import com.cg.model.Student;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student s = context.getBean(Student.class);
		System.out.println(s);
	}

}
