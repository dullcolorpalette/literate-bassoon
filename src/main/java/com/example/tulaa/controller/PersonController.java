package com.example.tulaa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.tulaa.repository.PersonRepository;
import com.example.tulaa.model.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class PersonController{
    
    @Autowired PersonRepository personRepository;

    //Get all person data
    @GetMapping("/person")
    public List<Person> getAllData() {
        return personRepository.findAll();
    }

    // New CSV data upload
    @PostMapping("/upload")
    public Person uploadCSV(@Valid @RequestBody Person person){
        return personRepository.save(person);
    }
}