package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(value = {"*"})

@SpringBootApplication
public class ImoocBilibiliApp {

    public static void main(String[] args){
        ApplicationContext app = SpringApplication.run(ImoocBilibiliApp.class, args);
    }
}
