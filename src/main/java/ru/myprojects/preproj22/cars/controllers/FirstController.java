package ru.myprojects.preproj22.cars.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.myprojects.preproj22.cars.service.CarService;

@Controller
public class FirstController {

    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", required = false) Integer carsToShow, Model model) {
        model.addAttribute("carList", carService.showCars(carService.generateList(), carsToShow));
        return "cars";
    }

}
