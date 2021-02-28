package me.god.boot.hello.controller;

import me.god.boot.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    /**
     * 测试自定义starter是否成功
     * @param username
     * @return
     */
    @RequestMapping("/hello")
    public String sayHello(@RequestParam String username) {
        return helloService.sayHello(username);
    }
}
