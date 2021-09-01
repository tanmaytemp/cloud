package com.example.deploymentonazure;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CityDao extends CrudRepository<City, Integer> {
    @Query(value="Select c FROM City c ORDER BY c.cid DESC")
    ArrayList<City> filter();
}
