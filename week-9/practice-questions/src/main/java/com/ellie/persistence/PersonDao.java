package com.ellie.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ellie.entitiy.Person;

public interface PersonDao extends JpaRepository<Person, Integer> {

}
