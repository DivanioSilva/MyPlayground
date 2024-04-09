package com.ds.keycloak.mapper;

import com.ds.keycloak.domain.Person;
import com.ds.keycloak.dto.PersonDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonDto toDto(Person person);
    Person toPerson(PersonDto personDto);
    List<PersonDto> toDto(List<Person> persons);
    void update(@MappingTarget Person personDB, PersonDto personDto);
}
