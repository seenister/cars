package ru.myprojects.preproj22.cars.service;

import ru.myprojects.preproj22.cars.models.Car;

import java.util.List;

public interface CarService {

    List<Car> showCars(List<Car> list, Integer number);
    int countCars(List<Car> list);
    List<Car> generateList();


}
