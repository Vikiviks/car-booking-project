package com.example.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.car.model.CarModel;
import com.example.car.repository.CarRepository;

@RestController
public class CarController {
      @Autowired
      CarRepository cr;
      @GetMapping("/car")
      public List<CarModel> getAllDetails(){
    	  return cr.findAll();
      }
      @GetMapping("/car/{id}")
  	public CarModel getDetailsById(@PathVariable int id)
  	{
  		return cr.findById(id).orElse(null);
  	}
  	@PostMapping("/save")
  	public String saveall(@RequestBody CarModel id)
  	{
  		cr.save(id);
  		return "Id Details Saved";
  	}
  	@DeleteMapping("/crud/{id}")
	public String deleteById(@PathVariable int id)
	{
		cr.deleteById(id);
		return "Id details deleted";
	}
	@PutMapping("/put")
	public CarModel putDetailsById(@RequestBody CarModel s)
	{
		return cr.save(s);
	}
}
