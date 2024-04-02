package com.example.Diplom204.service.impl;

import com.example.Diplom204.model.Security;
import com.example.Diplom204.repository.SecurityRepository;
import com.example.Diplom204.service.SecurityService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class SecurityServiceImpl implements SecurityService {
    private final SecurityRepository repository;

    @Override
    public List<Security> findAllSecurity() {
        return repository.findAll();
    }

    @Override
    public Security saveSecurity(Security security) {
        return repository.save(security);
    }

    @Override
    public Security findByEmail(String email) {
        return repository.findSecurityByEmail(email);
    }

    @Override
    public Security updateSecurity(Security security) {
        return repository.save(security);
    }

    @Override
    @Transactional
    public void deleteSecurity(String email) {
        repository.deleteByEmail(email);
    }
}
