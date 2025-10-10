package com.olale.teacher;

import com.olale.teacher.entities.Teacher;
import com.olale.teacher.repo.TeacherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class TeacherApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeacherApplication.class, args);
	}

    @Bean
    CommandLineRunner commandLineRunner(TeacherRepository teacherRepository) {
        return args ->
            teacherRepository.save(Teacher.builder()
                    .firstName("Olale")
                    .lastName("Sam")
                    .depCode("IT")
                    .build());

    }

    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }
// comments
}
