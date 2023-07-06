package com.ellie.model.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ellie.entity.DVD;
@Repository
public interface DVDDao extends JpaRepository<DVD, Integer> {

}
