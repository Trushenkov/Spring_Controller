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
    public void contextLoads() {
        SimpleController controller = new SimpleController();
        controller.request();

        assertEquals("GET запрос успешно выполнен.",controller.request());
    }

}
