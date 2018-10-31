package lt.mif.oopu2.service;

import lt.mif.oopu2.demen.Car;

import java.util.List;

public interface CarService {

	String go();

	List<Car> findAllCars();

	Car createNewCar(String nr, String marke);
}
