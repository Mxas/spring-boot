package lt.mif.oopu2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lt.mif.oopu2.service.CarService;

@RestController
public class CarController {

	@Autowired
	private CarService carService;

	@RequestMapping("/")
	public String testas() {
		return "Testas";
	}

	@RequestMapping("/carGo")
	public String carGo() {
		return carService.go();
	}

}
