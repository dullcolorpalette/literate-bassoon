package com.example.tulaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.tulaa.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}