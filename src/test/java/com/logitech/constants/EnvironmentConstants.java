package com.logitech.constants;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.TestPropertySource;

@Getter
@Configuration
//@TestPropertySource(locations = "environment.properties")
public class EnvironmentConstants {

    @Value("${naukriUrl}")
    private String naukriUrl;

    @Value("${herokuapp.url}")
    private String herokuappUrl;

    @Value("${banners}")
    private String bannersService;
}
