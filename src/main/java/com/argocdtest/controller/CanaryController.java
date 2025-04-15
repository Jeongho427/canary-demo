package com.argocdtest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CanaryController {

    @Value("${app.version}")
    private String version;

    @GetMapping("/version")
    public String getVersion() {
        return version + " version!";
    }
}

