package lt.mif.oopu2.service.impl;

import lt.mif.oopu2.service.CarService;

public class CarServiceRedImpl implements CarService {

	@Override
	public String go() {
		System.out.println("Red car service implementation");
		return "Red Car";
	}

}
