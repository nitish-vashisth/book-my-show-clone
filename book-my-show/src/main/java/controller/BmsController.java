package controller;

import bmscore.RequestManager;
import com.example.bms.book_my_show_clone.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BmsController {

    @Autowired RequestManager requestManager;

    @GetMapping("/city")
    public List<City>  GetListOfCities() {
        System.out.println("GTetting cities");
        return requestManager.getCities();
    }

    @PostMapping("/addcity")
    public List<City>  GetListOfCities(@RequestBody String cityName) {
        System.out.println("Adding new  City " + cityName);
        return requestManager.addCity(cityName);
    }

    @PostMapping("/book")
    public List<City>  createBooking(@RequestBody String cityName) {
        System.out.println("Adding new  City " + cityName);
        return requestManager.addCity(cityName);
    }


}
