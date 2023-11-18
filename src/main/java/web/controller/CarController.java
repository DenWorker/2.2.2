package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String getCars(Model model) {
        List<Car> listOfCars = new ArrayList<>();
        listOfCars.add(new Car(1, "model1", 1));
        listOfCars.add(new Car(2, "model2", 2));
        listOfCars.add(new Car(3, "model3", 3));
        listOfCars.add(new Car(4, "model4", 4));
        listOfCars.add(new Car(5, "model5", 5));

        model.addAttribute("listOfCars", carService.getCarsFromList(listOfCars, 20));
        return "cars";
    }
}
