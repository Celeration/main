package com.example.Diplom204.repository.DAO;

import com.example.Diplom204.model.TimeCard;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryTimeCardDAO {
    private final List<TimeCard> TIMECARD = new ArrayList<>();

    public List<TimeCard> findAllTimeCard() {
        return TIMECARD;
    }

    public TimeCard saveTimeCard(TimeCard timecard) {
        TIMECARD.add(timecard);
        return timecard;
    }

    public TimeCard findByEmailTimeCard(String email) {
        return TIMECARD.stream()
                .filter(element -> element.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public TimeCard findByIdTimeCard(Long id) {
        return TIMECARD.stream()
                .filter(element -> element.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void deleteTimeCardId(Long id) {
        var timecard = findByIdTimeCard(id);
        if(timecard != null){
            TIMECARD.remove(timecard);
        }
    }

}
