package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student carlos = new Student(
                    "Carlos Bianchi",
                    "carlitos@gmail.com",
                    LocalDate.of(1949, APRIL, 26)
            );
            Student roman = new Student(
                    "Roman Riquelme",
                    "roman@gmail.com",
                    LocalDate.of(1978, JUNE, 24)
            );

            repository.saveAll(List.of(carlos,roman));
        };
    };

}
