package com.ds.keycloak.service;

import com.ds.keycloak.domain.Person;
import com.ds.keycloak.dto.PersonDto;
import com.ds.keycloak.mapper.PersonMapper;
import com.ds.keycloak.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements PersonServiceIF {
    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public PersonService(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    @Override
    public PersonDto createPerson(PersonDto dto) {
        var person = personMapper.toPerson(dto);
        Person response = personRepository.save(person);
        return personMapper.toDto(response);
    }

    @Override
    public PersonDto updatePerson(PersonDto dto) {
        Person person = personRepository.findById(dto.id()).get();
        personMapper.update(person, dto);
        Person saved = personRepository.save(person);
        return personMapper.toDto(saved);
    }

    @Override
    public PersonDto findPersonById(Long id) {
        Person person = personRepository.findById(id).get();
        return personMapper.toDto(person);
    }

    @Override
    public List<PersonDto> findAllPersons() {
        List<Person> persons = personRepository.findAll();
        return personMapper.toDto(persons);
    }

    @Override
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}
