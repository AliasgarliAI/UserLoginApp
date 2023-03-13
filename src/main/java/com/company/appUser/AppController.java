package com.company.appUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appcont")
public class AppController {

    @Autowired
    public AppService appService;


    @GetMapping
    public String myApp(){
        System.out.println("myapp methoduna girdi");
        return appService.test();

    }


}
