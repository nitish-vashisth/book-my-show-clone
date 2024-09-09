package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MyCity {

    @Id
    int City_id;

    String Name;

    public int getCity_id() {
        return City_id;
    }

    public void setCity_id(int city_id) {
        City_id = city_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
