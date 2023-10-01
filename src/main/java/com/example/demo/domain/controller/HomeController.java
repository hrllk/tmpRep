
package com.example.demo.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.service.HiService;


@RestController
public class HomeController{
    

    @Autowired
    private HiService hiService;

    @RequestMapping
    public void hi(){
        hiService.hi();
        
        
        
    }
    

}
