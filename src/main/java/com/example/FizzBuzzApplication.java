package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class FizzBuzzApplication {

    public static void main(String[] args) {
        SpringApplication.run(FizzBuzzApplication.class, args);
    }

    public String calculate(Integer number) {
        Map<Integer, String> configs = this.config();
        String result = null;
        for (Map.Entry<Integer, String> entry :
                configs.entrySet()) {
            if (number % entry.getKey() == 0) {
                result = entry.getValue();
            }
        }
        return result != null ? result : number.toString();
        //return number.toString();
    }


    public Map<Integer, String> config() {
        Map<Integer, String> config = new HashMap<>();
        config.put(15, "FizzBuzz");
        config.put(3, "Fizz");
        config.put(5, "Buzz");

        return config;
    }
}
