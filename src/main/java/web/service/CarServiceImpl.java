package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1L, "Tesla", "Model 3"));
        cars.add(new Car(2L, "Tesla", "Model Y"));
        cars.add(new Car(3L, "Tesla", "Model X"));
        cars.add(new Car(4L, "Tesla", "Model S"));
        cars.add(new Car(5L, "Tesla", "Prototype"));
    }

    @Override
    public List<Car> showList(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
