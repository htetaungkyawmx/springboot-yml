package com.example.springbootyml.configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@ConfigurationProperties(prefix = "app")
public class ApplicationConfiguration {

    private String name;
    private String description;
    private List<String> servers;

    private Map<String, EnvironmentConfiguration> environments;


}
