package com.ellie.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ellie.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{

}
