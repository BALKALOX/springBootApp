package com.example.springBootApp;

import com.example.springBootApp.Repository.PersonRepository;
import com.example.springBootApp.people.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.CommandLinePropertySource;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class PersonConfig {
    @Bean
    public CommandLineRunner commandLineRunner(PersonRepository personRepository){
        return args -> {
            personRepository.saveAll(List.of(
                    new Person("Anton","Misiura", LocalDate.of(2004, Month.APRIL,17)),
                    new Person("Vasyl","Stus",LocalDate.of(1935, Month.JANUARY,8)),
                    new Person("Taras","Shevchenko",LocalDate.of(1814,Month.MARCH,9))
            ));
        };
    }
}
