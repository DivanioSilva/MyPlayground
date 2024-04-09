package com.ds.keycloak.service;

import com.ds.keycloak.domain.Person;
import com.ds.keycloak.dto.PersonDto;

import java.util.List;

public interface PersonServiceIF {
    PersonDto createPerson(PersonDto dto);

    PersonDto updatePerson(PersonDto dto);

    PersonDto findPersonById(Long id);


    List<PersonDto> findAllPersons();

    void deletePerson(Long id);
}
