package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImp implements CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Tesla", 3, "Green"));
        carList.add(new Car("BMW", 7, "Red"));
        carList.add(new Car("Moskvich", 1, "Gold"));
        carList.add(new Car("Audi", 5, "Black"));
        carList.add(new Car("Porshe", 2, "White"));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null) {
            return carList;
        } else if (count <= 5) {
            return carList.stream()
                    .limit(count)
                    .collect(Collectors.toList());
        }
      return null;
    }
}
