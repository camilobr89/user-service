package com.microservice.userservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @JsonProperty("firstName")
    @Column(name = "first_name")
    private String firstName;

    @JsonProperty("lastName")
    @Column(name = "lastName")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("age")
    private int age;
}



