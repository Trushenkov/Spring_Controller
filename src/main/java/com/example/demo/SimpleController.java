package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    private static final String string = "/request";

    private static final String welcome = "/welcome";

    @RequestMapping(value = string)
    public String request() {
        return "GET запрос успешно выполнен.";
    }


    @RequestMapping(value = welcome)
    public String welcome() {
        return "Welcome on my page, User!";
    }


}
