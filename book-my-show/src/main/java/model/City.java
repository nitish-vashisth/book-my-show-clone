package model;

public class City {

    int cityId;

    String cityName;

    public City(String cityName, int cityId) {
        this.cityName = cityName;
        this.cityId = cityId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

}
