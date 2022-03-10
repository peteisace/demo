package com.healthcare.starter.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.AbstractDataSource;

import javax.print.attribute.standard.JobKOctets;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
public class MyModule {

    @Value("${hc.example.value1}")
    private String value1;

    @Value("${hc.example.value2}")
    private int value2;

    @Value("${hc.example.value3}")
    private boolean value3;

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public MyConfiguration myConfiguration(ObjectMapper objectMapper) {
        return new MyConfiguration(this.value1, this.value2,
                this.value3, objectMapper);
    }

    @Bean
    public DataSource dataSource() {
        return new AbstractDataSource() {
            @Override
            public Connection getConnection() throws SQLException {
                return null;
            }

            @Override
            public Connection getConnection(String username, String password) throws SQLException {
                return null;
            }
        };
    }
}
