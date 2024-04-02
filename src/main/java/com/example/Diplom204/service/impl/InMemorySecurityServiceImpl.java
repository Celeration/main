package com.example.Diplom204.service.impl;

import com.example.Diplom204.model.Security;
import com.example.Diplom204.repository.DAO.InMemorySecurityDAO;
import com.example.Diplom204.service.SecurityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemorySecurityServiceImpl implements SecurityService {
    private final InMemorySecurityDAO repository;

    @Override
    public List<Security> findAllSecurity() {
        return repository.findAllSecurity();
    }

    @Override
    public Security saveSecurity(Security security) {
        return repository.saveSecurity(security);
    }

    @Override
    public Security findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Security updateSecurity(Security security) {
        return repository.updateSecurity(security);
    }

    @Override
    public void deleteSecurity(String email) {
        repository.deleteSecurity(email);
    }
}
