package com.my_application.infrastructure.rest;

import com.my_application.domain.entity.AnotherDomain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/my-controller")
    public String getMyController() {
        var text = "test";
        new AnotherDomain(text);
        return text;
    }
}
