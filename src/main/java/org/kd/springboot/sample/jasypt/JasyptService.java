package org.kd.springboot.sample.jasypt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:properties/application.properties")
public class JasyptService {

    @Value("${my.password}")
    private String property;

    public String getProperty() {
        return property;
    }

}
