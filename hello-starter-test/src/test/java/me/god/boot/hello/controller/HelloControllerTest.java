package me.god.boot.hello.controller;

import me.god.boot.hello.common.BaseControllerTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest extends BaseControllerTest {

    @Test
    void sayHello() {
        String helloStr = restTemplate.getForObject(url("/hello?username=xiao"), String.class);
        System.out.println("helloStr = " + helloStr);
    }
}