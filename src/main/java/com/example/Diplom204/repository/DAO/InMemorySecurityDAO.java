package com.example.Diplom204.repository.DAO;

import com.example.Diplom204.model.Security;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemorySecurityDAO {
    private final List<Security> SECURITY = new ArrayList<>();

    public List<Security> findAllSecurity() {
        return SECURITY;
    }

    public Security saveSecurity(Security security) {
        SECURITY.add(security);
        return security;
    }

    public Security findByEmail(String email) {
        return SECURITY.stream()
                .filter(element -> element.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public Security updateSecurity(Security security) {
        var securityIndex = IntStream.range(0, SECURITY.size())
                .filter(index -> SECURITY.get(index).getEmail().equals(security.getEmail()))
                .findFirst()
                .orElse(-1);
        if (securityIndex > -1){
            SECURITY.set(securityIndex, security);
            return security;
        }
        return null;
    }

    public void deleteSecurity(String email) {
        var security = findByEmail(email);
        if(security != null){
            SECURITY.remove(security);
        }
    }

}
