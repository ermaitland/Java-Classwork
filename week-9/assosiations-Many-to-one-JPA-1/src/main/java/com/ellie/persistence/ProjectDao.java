package com.ellie.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ellie.dto.entity.Project;

public interface ProjectDao extends JpaRepository<Project, Integer> {

}
