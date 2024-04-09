package com.ds.keycloak.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String surname;
    private String email;
    private String phone;
}
