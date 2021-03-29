package com.kwkim.spring.integration.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
@ImportResource("/integration/integration.xml")
public class SpringIntegrationExampleApplication {

    public static void main(String[] args) throws IOException {
        //SpringApplication.run(SpringIntegrationExampleApplication.class, args);
        ConfigurableApplicationContext ctx = new SpringApplication(SpringIntegrationExampleApplication.class).run(args);
        System.out.println("Hit Enter to terminate");
        System.in.read();
        ctx.close();
    }

}
