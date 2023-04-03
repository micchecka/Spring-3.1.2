package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {
private final CarService carService;
@Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

@GetMapping("/cars")

    public String getCar(@RequestParam("count") int count, Model model) {
      model.addAttribute("parameters", carService.getCars(count));
    System.out.println(count);
        return "cars";
    }
}


