package com.company.appUser;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    AppUser user;
    @PreAuthorize("hasRole('ADMIN')")
    public String test(){
        String field = "test method worked";
        user.getAppUserRole();
        System.out.println(field);
        return field;
    }
}
