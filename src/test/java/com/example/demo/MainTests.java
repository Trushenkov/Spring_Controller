package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainTests {

    @Test
    public void getRequest() {
        SimpleController controller = new SimpleController();

        assertEquals("GET запрос успешно выполнен.",controller.request());
    }

    @Test
    public void getWelcome() {
        SimpleController controller = new SimpleController();

        assertEquals("Welcome on my page, User!", controller.welcome());
    }

}
