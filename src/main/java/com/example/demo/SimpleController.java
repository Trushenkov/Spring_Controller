package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    private static final String string = "/request";

    @RequestMapping(value = string)
    public String request() {
        return "GET запрос успешно выполнен.";
    }



}
