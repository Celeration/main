package com.example.Diplom204.controller;

import com.example.Diplom204.model.TimeCard;
import com.example.Diplom204.service.TimeCardService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/timecard")
@AllArgsConstructor
public class TimeCardController {
    @NonNull
    private final TimeCardService service;

    @GetMapping
    public List<TimeCard> findAllTimeCard(){
        return service.findAllTimeCard();

    }

    @PostMapping("save_timecard")
    public TimeCard saveTimeCard(@RequestBody TimeCard timecard){
        return service.saveTimeCard(timecard);
    }

    @GetMapping("/{email}")
    public TimeCard findByEmailTimeCard(@PathVariable String email){
        return service.findByEmailTimeCard(email);
    }

    @GetMapping("/id/{id}")
    public TimeCard findByIdTimeCard(@PathVariable Long id){
        return service.findByIdTimeCard(id);
    }

    @DeleteMapping("delete_timecard/{id}")
    public void deleteTimeCard(@PathVariable Long id){
        service.deleteTimeCard(id);
    }
}
