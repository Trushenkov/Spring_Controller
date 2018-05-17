package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Класс, в котором создается и отправляется запрос.
 *
 * @author Трушенков Дмитрий
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        String urlAddress = "https://vk.com/";

        HttpURLConnection connection = null;

        try {
            connection = (HttpURLConnection) new URL(urlAddress).openConnection();

            HttpController controller = new HttpController();
            connection.setRequestMethod("GET");

            if (controller.isCheck(connection)) {

                controller.response(connection);

            } else {
                System.out.println("Что-то пошло не так... Код ошибки: " + connection.getResponseCode() + " Текст ошибки: " + connection.getResponseMessage());

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

    }

}
