package com.ds.keycloak.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * DTO for {@link com.ds.keycloak.domain.Person}
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PersonDto(Long id, String name, String surname, String email, String phone) implements Serializable {
}
