package org.kd.springboot.sample.jasypt;


import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@EnableEncryptableProperties
@SpringBootApplication
public class JasyptSpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplication().run(JasyptSpringBootApplication.class, args);
        JasyptService jasyptService = applicationContext.getBean(JasyptService.class);
        System.out.println(jasyptService.getProperty());
    }
}
