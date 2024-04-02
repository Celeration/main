package com.example.Diplom204.service.impl;

import com.example.Diplom204.model.TimeCard;
import com.example.Diplom204.repository.TimeCardRepository;
import com.example.Diplom204.service.TimeCardService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class TimeCardServiceImpl implements TimeCardService {
    private final TimeCardRepository repository;

    @Override
    public List<TimeCard> findAllTimeCard() {
        return repository.findAll();
    }

    @Override
    public TimeCard saveTimeCard(TimeCard timecard) {
        return repository.save(timecard);
    }

    @Override
    public TimeCard findByEmailTimeCard(String email) {
        return repository.findByEmailTimeCard(email);
    }

    @Override
    public TimeCard findByIdTimeCard(Long id) {
        return repository.findByIdTimeCard(id);
    }

    @Override
    @Transactional
    public void deleteTimeCard(Long id) {
        repository.deleteTimeCardId(id);
    }

}
