package repository;

import model.MyCity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class BmsData {

    @Autowired
    BlogRespository blogRespository;

    static HashMap<String, Integer> map  = new HashMap<>();

    static  int max = 5;

    public HashMap<String, Integer> getCities() {

        try {

            System.out.println("Fetching from DB");

            List<MyCity> myCities = blogRespository.findAll();

            for(MyCity city : myCities)
                System.out.println(city.getName());

            System.out.println("DB fetch done");

        } catch (Exception e) {
            System.out.println(e);
        }

        map.put("Delhi", 1);
        map.put("Mumbai", 2);
        map.put("Pune", 3);
        map.put("Bangalore", 4);
        map.put("Hyderabad", 5);
        return map;
    }

    public HashMap<String, Integer> addCity(String name) {
        max = max + 1;
        map.put(name, max);
        return  map;
    }

}
