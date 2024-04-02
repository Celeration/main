package com.example.Diplom204.repository;

import com.example.Diplom204.model.TimeCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeCardRepository extends JpaRepository<TimeCard, Long> {
    void deleteTimeCardId(Long id);
    TimeCard findByEmailTimeCard(String email);
    TimeCard findByIdTimeCard(Long id);

}
