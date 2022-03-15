package ru.myprojects.preproj22.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.myprojects.preproj22.cars.service.CarService;
import ru.myprojects.preproj22.cars.service.CarServiceImp;

@SpringBootApplication
public class CarsApplication {

/*	@Autowired
	CarService carService;*/

	public static void main(String[] args) {

		CarService carService = new CarServiceImp();
		SpringApplication.run(CarsApplication.class, args);
		System.out.println(carService.countCars(carService.generateList()));
	}


}
