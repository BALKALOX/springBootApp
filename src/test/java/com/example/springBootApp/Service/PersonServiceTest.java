package com.example.springBootApp.Service;

import com.example.springBootApp.Repository.PersonRepository;
import com.example.springBootApp.people.Person;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    @Test
    Optional<Person> show(Long id){
        PersonRepository personRepository = new PersonRepository() {
            @Override
            public void flush() {

            }

            @Override
            public <S extends Person> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Person> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Person> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Person getOne(Long aLong) {
                return null;
            }

            @Override
            public Person getById(Long aLong) {
                return null;
            }

            @Override
            public Person getReferenceById(Long aLong) {
                return null;
            }

            @Override
            public <S extends Person> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Person> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends Person> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public List<Person> findAll() {
                return null;
            }

            @Override
            public List<Person> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public <S extends Person> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Person> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(Person entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends Person> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public List<Person> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<Person> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Person> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Person> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Person> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Person> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends Person, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        };
        return personRepository.findById(id);
    }
}