package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {


    @Override
    public List<Car> createAndGetListOfCars(int countCars) {
        List<Car> listOfCars = new ArrayList<>();
        listOfCars.add(new Car(1, "model1", 1));
        listOfCars.add(new Car(2, "model2", 2));
        listOfCars.add(new Car(3, "model3", 3));
        listOfCars.add(new Car(4, "model4", 4));
        listOfCars.add(new Car(5, "model5", 5));

        return listOfCars.stream().limit(countCars).toList();
    }
}
