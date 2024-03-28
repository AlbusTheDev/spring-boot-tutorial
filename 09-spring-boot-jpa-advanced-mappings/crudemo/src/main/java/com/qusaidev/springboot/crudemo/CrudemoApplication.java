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
            deleteInstructor(appDAO);
        };
    }

    private void deleteInstructor(AppDAO appDAO) {
        int id = 1;

        appDAO.deleteInstructorById(id);
        System.out.printf("Deleted instructor id %d successfully", id);
    }

    private void findInstructor(AppDAO appDAO) {
        int id = 1;

        Instructor instructor = appDAO.findInstructorById(id);
        System.out.printf("Found instructor id %d with name: %s %s",
                id, instructor.getFirstName(), instructor.getLastName());
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
