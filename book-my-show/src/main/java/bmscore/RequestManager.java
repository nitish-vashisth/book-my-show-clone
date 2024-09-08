package bmscore;

import model.City;
import repository.BmsData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequestManager {

    public List<City> getCities() {

        List<City> cityList = new ArrayList<>();

        BmsData bmsData = new BmsData();

        HashMap<String, Integer> map = bmsData.getCities();

        for(Map.Entry<String, Integer> city  :  map.entrySet()) {
            cityList.add(new City(city.getKey(), city.getValue()));
        }

        return  cityList;
    }

    public List<City> addCity(String cityName) {
        BmsData bmsData = new BmsData();
        HashMap<String, Integer> map  =  bmsData.addCity(cityName);

        List<City> cityList = new ArrayList<>();

        for(Map.Entry<String, Integer> city  :  map.entrySet()) {
            cityList.add(new City(city.getKey(), city.getValue()));
        }

        return  cityList;
    }

}
