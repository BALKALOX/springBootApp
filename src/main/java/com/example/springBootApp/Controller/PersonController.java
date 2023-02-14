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
    @RequestMapping("list")
    public List<Person> list(){
        return personService.list();
    }
    @RequestMapping("item/{id}")
    public Optional<Person> show(@PathVariable Long id){
        return personService.show(id);
    }
    @PostMapping("add")
    public Person add(@RequestBody Person person){
        return personService.add(person);
    }
    @PutMapping("update_item/{id}")
    public Person update(@RequestBody Person person){
       return personService.update(person);
    }
    @RequestMapping("delete_item/{id}")
    public void delete(@PathVariable Long id){
        personService.delete(id);
    }


}
