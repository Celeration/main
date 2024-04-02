package com.example.Diplom204.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
@Table(name = "security")
public class Security {

    @Id
    @GeneratedValue
    private Long id;

    private String fullName;
    private String password;

    private LocalDate dareOfBirth;

    @Column(unique = true)
    private String email;

    @Transient
    private int age;

    public int getAge() {
        return Period.between(dareOfBirth, LocalDate.now()).getYears();
    }
}