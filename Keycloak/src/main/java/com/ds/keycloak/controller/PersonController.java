package com.ds.keycloak.controller;

import com.ds.keycloak.dto.PersonDto;
import com.ds.keycloak.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public PersonDto createPerson(@RequestBody PersonDto personDto) {
        return personService.createPerson(personDto);
    }

    @PutMapping
    public PersonDto updatePerson(@RequestBody PersonDto person) {
        return personService.updatePerson(person);
    }

    @DeleteMapping
    public void deletePerson(@RequestBody Long personId) {
        personService.deletePerson(personId);
    }

    @GetMapping
    public List<PersonDto> getAllPersons() {
        return personService.findAllPersons();
    }

    @GetMapping("/{personId}")
    public PersonDto getPerson(@PathVariable Long personId) {
        return personService.findPersonById(personId);
    }
}
