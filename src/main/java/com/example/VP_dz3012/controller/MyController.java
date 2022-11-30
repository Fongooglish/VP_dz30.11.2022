package com.example.VP_dz3012.controller;

import com.example.VP_dz3012.model.People;
import com.example.VP_dz3012.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    SumService service;

    @Autowired
    public MyController(SumService service) {
        this.service = service;
    }

    @GetMapping("list/")
    public String text(){
        return "Hello_World!";
    }

    @GetMapping("sum/")
    public String sum() {
        return service.SumService();
    }

    @GetMapping("people/")
    public People getPeople() {
        People man = new People("Иванов", "Сергей", 19);
        return man;
    }
}
