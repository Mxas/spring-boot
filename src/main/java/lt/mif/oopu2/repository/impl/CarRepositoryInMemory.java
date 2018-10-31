package lt.mif.oopu2.repository.impl;

import lt.mif.oopu2.demen.Car;
import lt.mif.oopu2.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;

public class CarRepositoryInMemory implements CarRepository {
    private List<Car> storage = new ArrayList<>();

    @Override
    public void create(Car car) {
        this.storage.add(car);
    }

    @Override
    public List<Car> getAll() {
        return new ArrayList<>(this.storage);
    }
}
