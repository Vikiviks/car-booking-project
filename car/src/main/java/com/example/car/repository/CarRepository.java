package com.example.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.car.model.CarModel;

@Repository 
public interface CarRepository extends JpaRepository <CarModel,Integer> {

}
