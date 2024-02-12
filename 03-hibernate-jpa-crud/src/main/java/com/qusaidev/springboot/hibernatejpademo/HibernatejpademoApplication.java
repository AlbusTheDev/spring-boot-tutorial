package com.qusaidev.springboot.hibernatejpademo;

import com.qusaidev.springboot.hibernatejpademo.dao.StudentDAO;
import com.qusaidev.springboot.hibernatejpademo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HibernatejpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernatejpademoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {

			deleteAllStudents(studentDAO);

		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		System.out.println("Deleting all students...");
		System.out.println("Number of rows deleted: " + studentDAO.deleteAll());
	}

	private void deleteStudent(StudentDAO studentDAO) {
		System.out.println("Deleting student with id 3");
		studentDAO.delete(3);
	}

	private void updateStudent(StudentDAO studentDAO) {
		Student student = studentDAO.findById(1);
		student.setFirstName("Scooby");
		studentDAO.update(student);
		System.out.println("Student is updated");
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findByLastName("Public");

		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();

		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		Student student = studentDAO.findById(1);
		System.out.println(student);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		System.out.println("Creating new student object...");
		Student tempStudent = new Student("John", "Doe", "john@qusaidev.com");
		Student tempStudent2 = new Student("Mary", "Public", "mary@qusaidev.com");
		Student tempStudent3 = new Student("Bonita", "Applebum", "bonitaa@qusaidev.com");

		System.out.println("Saving the students...");
		studentDAO.save(tempStudent);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Create new student object...");
		Student tempStudent = new Student("Paul", "Doe", "paul@qusaidev.com");

		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		System.out.println("Student saved, id: " + tempStudent.getId());
	}
}
