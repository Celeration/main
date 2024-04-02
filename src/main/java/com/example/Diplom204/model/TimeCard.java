package com.example.Diplom204.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "timecard")
public class TimeCard {

    @Id
    @GeneratedValue
    private Long id;

    private String email;

    private LocalDate dateToDay;
    private LocalTime startTime;
    private LocalTime endTime;


}
