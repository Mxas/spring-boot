package lt.mif.oopu2.service.impl;

import lt.mif.oopu2.demen.Car;
import lt.mif.oopu2.service.CarService;

public class CarServiceRedImpl extends AbstractCarService implements CarService {


    @Override
    public String go() {
        System.out.println("Red car service implementation");
        return "Red Car";
    }

    @Override
    public Car createNewCar(String nr, String marke) {
        return super.createNewCar(nr, marke, "Red");
    }

}
