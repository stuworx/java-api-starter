package com.example.starterapi.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyErrorController implements ErrorController  {
 
    @RequestMapping("/error")
    public String handleError() {
    
        //do something like logging
        return "Page was Not found";
    }
 
    @Override
    public String getErrorPath() {
        return "/error";
    }
}