package com.example.springBootApp.people;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
public class Person {
    @Id
    @SequenceGenerator(name = "person_sequence", sequenceName = "person_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_sequence")
    private Long id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    public Person() {
    }
    public Person(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname=surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public int getAge(){
        return Period.between(dateOfBirth,LocalDate.now()).getYears();
    }
}
