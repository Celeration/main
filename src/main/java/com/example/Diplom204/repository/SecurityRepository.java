package com.example.Diplom204.repository;

import com.example.Diplom204.model.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Long> {
    void deleteByEmail(String email);
    Security findSecurityByEmail(String email);
}


