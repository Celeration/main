package com.example.Diplom204.service;

import com.example.Diplom204.model.TimeCard;

import java.util.List;

public interface TimeCardService {
    List<TimeCard> findAllTimeCard();
    TimeCard saveTimeCard(TimeCard timecard);
    TimeCard findByEmailTimeCard(String email);
    TimeCard findByIdTimeCard(Long id);
    void deleteTimeCard (Long id);
}
