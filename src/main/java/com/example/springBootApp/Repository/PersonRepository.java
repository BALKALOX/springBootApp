package com.example.springBootApp.Repository;

import com.example.springBootApp.people.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
