package com.cg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.model.Address;
import com.cg.model.Student;

@Configuration
public class AppConfig {

	@Bean(name="a1")
	public Address getPermAddress() {
		Address a = new Address();
		a.setCity("Cuncolim");
		a.setState("Goa");
		a.setPinCode("403703");
		return a;
	}
	
	@Bean(name="a2")
	public Address getTempAddress() {
		Address a = new Address();
		a.setCity("Margao");
		a.setState("Goa");
		a.setPinCode("403710");
		return a;
	}
	
	@Bean
	public Student getStudent() {
		Student s = new Student();
		s.setStudentId(101);
		s.setStudentName("Sahil");
		return s;
	}
}
