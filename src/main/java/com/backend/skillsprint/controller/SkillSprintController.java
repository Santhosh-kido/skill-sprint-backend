package com.backend.skillsprint.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillSprintController {

    @GetMapping("/ping")
    public ResponseEntity<String> healthCheck() {

        System.out.println("Spring is runinn..");

        return new ResponseEntity<>("Skill Sprint Service is up and running!", HttpStatus.OK);

    }

}
