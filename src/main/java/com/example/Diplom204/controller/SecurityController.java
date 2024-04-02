package com.example.Diplom204.controller;

import com.example.Diplom204.model.Security;
import com.example.Diplom204.service.SecurityService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/security")
@AllArgsConstructor
public class SecurityController {
    @NonNull
    private final SecurityService service;

    @GetMapping
    public List<Security> findAllSecurity(){
        // todo
        return service.findAllSecurity();

    }

    @PostMapping("save_security")
    public Security saveSecurity(@RequestBody Security security){
        return service.saveSecurity(security);
    }

    @GetMapping("/{email}")
    public Security findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }

    @PutMapping("update_security")
    public Security updateSecurity(Security security){
        return service.updateSecurity(security);
    }

    @DeleteMapping("delete_security/{email}")
    public void deleteSecurity(@PathVariable String email){
        service.deleteSecurity(email);
    }

}