package com.example.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.car.model.CarModel;
import com.example.car.repository.CarRepository;

@Service
public class CarService {
	@Autowired
	CarRepository cr;
	public List<CarModel> getAllDetails()
	{
		return cr.findAll();
	}

}
