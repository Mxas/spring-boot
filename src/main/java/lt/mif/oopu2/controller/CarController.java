package lt.mif.oopu2.controller;

import lt.mif.oopu2.demen.Car;
import lt.mif.oopu2.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/")
    public String main(Model model) {

        model.addAttribute("cars", getAll());
        model.addAttribute("color", carGo());

        return "index";
    }

    @RequestMapping("/testas")
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
