package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCarsFromList(List<Car> listOfCars, int count) {
        return listOfCars.stream().limit(count).toList();
    }
}
