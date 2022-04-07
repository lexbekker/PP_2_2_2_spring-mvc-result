package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1995, "Pajero", "Mitsubisi"));
        cars.add(new Car(2001, "Delta", "Daihatsu"));
        cars.add(new Car(2010, "Forester", "Subaru"));
        cars.add(new Car(1998, "Surf Hilux", "Toyota"));
        cars.add(new Car(2014, "SX4", "Suzuki"));
    }

    public List<Car> index() {
        return cars;
    }



}
