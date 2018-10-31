package lt.mif.oopu2.repository;

import lt.mif.oopu2.demen.Car;

import java.util.List;

public interface CarRepository {


    void create(Car car);


    List<Car> getAll();

}
