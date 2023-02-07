package com.example.springBootApp.Controller;

//import org.springframework.http.ResponseEntity;
import com.example.springBootApp.Service.PersonService;
import com.example.springBootApp.people.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/people")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("item/{id}")
    public Optional<Person> show(@PathVariable Long id){
        return personService.show(id);
    }

}
