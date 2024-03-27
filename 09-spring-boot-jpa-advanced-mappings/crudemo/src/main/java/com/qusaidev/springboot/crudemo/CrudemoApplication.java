package com.qusaidev.springboot.crudemo;

import com.qusaidev.springboot.crudemo.dao.AppDAO;
import com.qusaidev.springboot.crudemo.entity.Instructor;
import com.qusaidev.springboot.crudemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO) {
        return runner -> {
            createInstructor(appDAO);
        };
    }

    private void createInstructor(AppDAO appDAO) {

        Instructor instructor =
                new Instructor("Qusai", "Wael", "qusai@qusaidev.com");

        InstructorDetail instructorDetail =
                new InstructorDetail("https://youtube.com", "Reading");

        instructor.setInstructorDetail(instructorDetail);

        appDAO.save(instructor);
        System.out.println("Instructor Saved!");
    }
}
