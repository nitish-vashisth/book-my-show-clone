package bmscore;

import com.example.bms.book_my_show_clone.City;
import com.example.bms.book_my_show_clone.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.BmsData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class RequestManager {

    @Autowired
    CityRepository cityRepository;

    public List<City> getCities() {


        List<City> cityList = new ArrayList<>();

        try {
            System.out.println(" Fetching from DB");
            cityList  =  cityRepository.findAll();
        } catch (Exception e) {
            System.out.println("Exception occured " + e);
        }

        return  cityList;
    }

    public City addCity(String cityName) {

        City city = new City(cityName.trim());

        try {
            System.out.println(" Fetching from DB");
            return cityRepository.save(city);
        } catch (Exception e) {
            System.out.println("Exception occured while adding record " + e);
        }

        return  new City();
    }

    public City updateCity(String cityName) {

        try {
            System.out.println(" Fetching from DB");
            cityRepository.updateCityName(1, cityName);
        } catch (Exception e) {
            System.out.println("Exception occured while adding record " + e);
        }

        return  new City();
    }

    public City deleteCity(Integer id) {

        try {
            System.out.println(" Deleting from DB");
            cityRepository.deleteCity(id);
        } catch (Exception e) {
            System.out.println("Exception occured while adding record " + e);
        }

        return  new City();
    }

}
