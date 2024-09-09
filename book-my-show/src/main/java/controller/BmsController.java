package controller;

import bmscore.RequestManager;
import model.City;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BmsController {

    @GetMapping("/city")
    public List<City>  GetListOfCities() {
        RequestManager requestManager = new RequestManager();
        return requestManager.getCities();
    }

    @PostMapping("/addcity")
    public List<City>  GetListOfCities(@RequestBody String cityName) {
        System.out.println("Adding new  City " + cityName);
        RequestManager requestManager = new RequestManager();
        return requestManager.addCity(cityName);
    }

    @PostMapping("/book")
    public List<City>  createBooking(@RequestBody String cityName) {
        System.out.println("Adding new  City " + cityName);
        RequestManager requestManager = new RequestManager();
        return requestManager.addCity(cityName);
    }


}
