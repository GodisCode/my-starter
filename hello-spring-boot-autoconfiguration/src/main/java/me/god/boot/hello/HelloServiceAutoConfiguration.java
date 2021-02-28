package me.god.boot.hello;

import me.god.boot.hello.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类。
 * <p>{@code @ConditionalOnMissingBean(HelloService.class)}表示当容器中没有HelloService类的Bean时加载此配置。
 * <p>{@code @EnableConfigurationProperties(HelloProperties.class)}将HelloProperties类加载成Bean。
 * 与条件注解一起使用则根据条件决定是否加载成Bean。
 */
@Configuration
@ConditionalOnMissingBean(HelloService.class)
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguration {

    @Bean
    public HelloService helloService(HelloProperties helloProperties) {
        return new HelloService(helloProperties);
    }
}
