package com.example.Diplom204.service.impl;

import com.example.Diplom204.model.TimeCard;
import com.example.Diplom204.repository.DAO.InMemoryTimeCardDAO;
import com.example.Diplom204.service.TimeCardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryTimeCardServiceImpl implements TimeCardService {
    private final InMemoryTimeCardDAO repository;

    @Override
    public List<TimeCard> findAllTimeCard(){
        return repository.findAllTimeCard();
    }

    @Override
    public TimeCard saveTimeCard(TimeCard timecard) {
        return repository.saveTimeCard(timecard);
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
    public void deleteTimeCard(Long id) {
        repository.deleteTimeCardId(id);
    }

}
