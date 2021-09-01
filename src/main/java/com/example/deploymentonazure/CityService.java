package com.example.deploymentonazure;

import java.util.ArrayList;

public interface CityService {
    ArrayList<City> getCities();
    void post(City city);
    ArrayList<City> filter();
}
