package com.qusaidev.springboot.hibernatejpademo;

import com.qusaidev.springboot.hibernatejpademo.dao.StudentDAO;
import com.qusaidev.springboot.hibernatejpademo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernatejpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernatejpademoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Create new student object...");
		Student tempStudent = new Student("Paul", "Doe", "paul@qusaidev.com");

		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		System.out.println("Student saved, id: " + tempStudent.getId());
	}
}
