package com.ellie.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ellie.entitiy.Vehicle;

public interface VehicleDao extends JpaRepository<Vehicle, Integer>{

}
