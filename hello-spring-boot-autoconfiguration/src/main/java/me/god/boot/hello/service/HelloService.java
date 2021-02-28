package me.god.boot.hello.service;

import me.god.boot.hello.HelloProperties;

/**
 * Hello服务类
 */
public class HelloService {
    private final HelloProperties helloProperties;

    public HelloService(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHello(String username) {
        return helloProperties.getPrefix() + ": Hello " + username + ":" + helloProperties.getSuffix();
    }
}
