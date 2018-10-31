package lt.mif.oopu2.controller;

import lt.mif.oopu2.demen.Car;
import lt.mif.oopu2.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


    @RequestMapping("/getAll")
    @ResponseBody
    public List<Car> getAll() {
        return carService.findAllCars();
    }


    @RequestMapping("/createCar/{nr}/{marke}") //TODO: use put method!
    @ResponseBody
    public Car carGo(@PathVariable String nr, @PathVariable String marke) {
        return carService.createNewCar(nr, marke);
    }


}
