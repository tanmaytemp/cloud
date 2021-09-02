package com.example.deploymentonazure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MyController {

    @Autowired
    CityService service;

    @RequestMapping(method = RequestMethod.GET, value = "")
    String home(){
        return "Welcome to my first Azure Microservice deployment. Please show some love :) ";
    }


    @RequestMapping(method = RequestMethod.GET, value= "/city")
    ArrayList<City> gets(){
        return service.getCities();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/city/filter")
    ArrayList<City> filters(){
        return service.filter();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/city")
    String post(@RequestBody ArrayList<City> list){
        for (City c : list){
            service.post(c);
        }
        return "Successful";
    }

}
