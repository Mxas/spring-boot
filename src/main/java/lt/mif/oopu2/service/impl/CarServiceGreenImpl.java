package lt.mif.oopu2.service.impl;

import lt.mif.oopu2.service.CarService;

public class CarServiceGreenImpl implements CarService {

	@Override
	public String go() {
		System.out.println("Green car service implementation");
		return "Green car";
	}

}
