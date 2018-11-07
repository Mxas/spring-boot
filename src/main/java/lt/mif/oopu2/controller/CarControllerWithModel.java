package lt.mif.oopu2.controller;

import lt.mif.oopu2.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarControllerWithModel {

    @Autowired
    private CarService carService;

    @GetMapping("/")
    public String main(Model model) {

        model.addAttribute("cars", carService.findAllCars());
        model.addAttribute("color", carService.go());

        return "index";
    }

}