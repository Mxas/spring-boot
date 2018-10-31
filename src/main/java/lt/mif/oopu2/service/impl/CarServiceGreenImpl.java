package lt.mif.oopu2.service.impl;

import lt.mif.oopu2.demen.Car;
import lt.mif.oopu2.service.CarService;

public class CarServiceGreenImpl extends AbstractCarService implements CarService {

    @Override
    public String go() {
        System.out.println("Green car service implementation");
        return "Green car";
    }

    @Override
    public Car createNewCar(String nr, String marke) {
        return super.createNewCar(nr, marke, "Green");

    }

}
