package lt.mif.oopu2.service.impl;

import lt.mif.oopu2.demen.Car;
import lt.mif.oopu2.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractCarService {

    @Autowired
    private CarRepository carRepository;


    public List<Car> findAllCars() {
        return carRepository.getAll();
    }

    public void createCar(Car car) {
        carRepository.create(car);
    }

    public Car createNewCar(String nr, String marke, String color) {
        Car car = new Car();
        car.setColor(color);
        car.setValstNr(nr);
        car.setMarke(marke);
        createCar(car);
        return car;
    }
}
