package com.example.demspringboothelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    private Map<String,Object> map = new HashMap<String,Object>();

    @RequestMapping("/hello")
    public Map<String,Object> helloWorldController(){
     map.put("Sanjose","Stephan Joy")   ;
     map.put("SunnyVale","Bala krishna")   ;
      return  map;
    }

    @RequestMapping("/yes")
    public String helloWorld(){
        return  "Hello";
    }
}
