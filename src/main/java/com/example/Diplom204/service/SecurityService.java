package com.example.Diplom204.service;

import com.example.Diplom204.model.Security;

import java.util.List;

public interface SecurityService {
    List<Security> findAllSecurity();
    Security saveSecurity(Security security);
    Security findByEmail(String email);
    Security updateSecurity(Security security);
    void deleteSecurity (String email);
}
