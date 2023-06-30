package com.ellie.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ellie.dto.entity.DVD;


public interface DVDDao extends JpaRepository<DVD, Integer> {

	//SQL : select * from EmployeeJpa where department=?
	@Query("from DVD-LIB where directorName=:diName")
	List<DVD> findEmployeesByDirector(@Param("diName") String director);
	
	//SQL : select * from EmployeeJpa where name=?
	@Query("from DVD-LIB where title=:na")
	List<DVD> findDVDByName(@Param("na") String name);
}
