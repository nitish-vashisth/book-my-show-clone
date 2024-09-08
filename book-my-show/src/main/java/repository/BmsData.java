package repository;

import java.util.HashMap;
import java.util.Random;
import java.util.random.RandomGenerator;

public class BmsData {

    static HashMap<String, Integer> map  = new HashMap<>();

    static  int max = 5;

    public HashMap<String, Integer> getCities() {
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
