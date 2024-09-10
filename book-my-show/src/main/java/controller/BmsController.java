package controller;

import bmscore.RequestManager;
import com.example.bms.book_my_show_clone.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public City  addCity(@RequestBody String cityName) {
        System.out.println("Adding new  City " + cityName);
        return requestManager.addCity(cityName);
    }

    @PutMapping("/updatecity")
    public City  updateCity(@RequestBody String cityName) {
        System.out.println("Updating new  City " + cityName);
        return requestManager.updateCity(cityName);
    }

    @DeleteMapping("/deletecity")
    public City  removeCity(@RequestBody String id) {
        System.out.println("Deleting City with id " + id);
        return requestManager.deleteCity(Integer.parseInt(id));
    }

}
