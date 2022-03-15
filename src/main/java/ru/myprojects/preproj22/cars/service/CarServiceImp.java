package ru.myprojects.preproj22.cars.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.myprojects.preproj22.cars.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CarServiceImp implements CarService {

    @Value("${carService.maxCar}")
    private int maxCar;
    List<Car> carList = new ArrayList<>();


    @Override
    public List<Car> showCars(List<Car> list, Integer number) {

        if (number == null || number >= maxCar) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }

    @Override
    public int countCars(List<Car> list) {
        return list.size();
    }

    @Override
    public List<Car> generateList() {
        carList.add(new Car("Volvo", 2343, (float) 1.3));
        carList.add(new Car("Lada", 77, (float) 1.1));
        carList.add(new Car("Opel", 43, (float) 1.1));
        carList.add(new Car("Suzuki", 111, (float) 1.2));
        carList.add(new Car("Lada", 233, (float) 1.1));
        carList.add(new Car("Mercedes", 88, (float) 1.3));
        return carList;
    }
}

