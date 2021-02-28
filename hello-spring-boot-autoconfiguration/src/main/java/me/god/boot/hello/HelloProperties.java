package me.god.boot.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 属性配置类。
 * <p>对应spring boot的全局配置文件，如:application.yml/application.properties中的hello前缀属性。
 */
@ConfigurationProperties("hello")
public class HelloProperties {
    /**
     * 前缀
     */
    private String prefix;

    /**
     * 后缀，带有默认值
     */
    private String suffix = "END";

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
