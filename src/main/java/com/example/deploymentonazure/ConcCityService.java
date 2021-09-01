package com.example.deploymentonazure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ConcCityService implements CityService {

    @Autowired
    CityDao dao;


    @Override
    public ArrayList<City> getCities() {
        ArrayList<City> list = new ArrayList<>();
        dao.findAll().forEach(list::add);
        return list;
    }

    @Override
    public void post(City city) {
        dao.save(city);
    }
}
