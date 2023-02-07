package com.example.springBootApp.Service;

import com.example.springBootApp.people.Person;
import com.example.springBootApp.Repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Optional<Person> show(Long id) {
        return personRepository.findById(id);
    }
}
