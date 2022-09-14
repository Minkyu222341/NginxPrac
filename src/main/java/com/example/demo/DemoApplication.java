package com.example.demo;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

}

//  public static final String APPLICATION_LOCATIONS = "spring.config.location="
//          + "classpath:application.yml,"
//          + "/app/config/springboot-webservice/real-application.yml";
//
//  public static void main(String[] args) {
//    new SpringApplicationBuilder(DemoApplication.class)
//            .properties(APPLICATION_LOCATIONS)
//            .run(args);
//
//  }