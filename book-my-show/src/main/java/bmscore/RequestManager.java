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

        try {
            System.out.println(" Fetching from DB");
            List<City> cc  =  cityRepository.findAll();
            for(City x : cc)
                System.out.println("ID " + x.getId() + " Name " + x.getName());
        } catch (Exception e) {
            System.out.println("Exception occured " + e);
        }

        List<City> cityList = new ArrayList<>();

        BmsData bmsData = new BmsData();

        HashMap<String, Integer> map = bmsData.getCities();

        for(Map.Entry<String, Integer> city  :  map.entrySet()) {
            cityList.add(new City(city.getValue(), city.getKey()));
        }

        return  cityList;
    }

    public List<City> addCity(String cityName) {
        BmsData bmsData = new BmsData();
        HashMap<String, Integer> map  =  bmsData.addCity(cityName);

        List<City> cityList = new ArrayList<>();

        for(Map.Entry<String, Integer> city  :  map.entrySet()) {
            cityList.add(new City(city.getValue(), city.getKey()));
        }

        return  cityList;
    }

}
