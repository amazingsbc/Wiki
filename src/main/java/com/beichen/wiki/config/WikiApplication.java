package com.beichen.wiki.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

/**
 * 这个注解里面有个ComponentScan注解，可以扫描当前路径及以下的文件，所以旁边的controller包里面的TestController不需要加这个
 * 如果不在一个路径下的话这个类就要单独加一个   ComponentScan注解
 */
@ComponentScan("com.beichen")
@SpringBootApplication
@MapperScan("com.beichen.wiki.mapper")
public class WikiApplication {
    private static final Logger LOG = LoggerFactory.getLogger(WikiApplication.class);
    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(WikiApplication.class);
//        SpringApplication.run(WikiApplication.class, args);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功");
        LOG.info("地址：\thttp://127.0.0.1:{}",env.getProperty("server.port"));

    }

}
