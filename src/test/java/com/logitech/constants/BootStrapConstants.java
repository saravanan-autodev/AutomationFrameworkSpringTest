package com.logitech.constants;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.TestPropertySource;

@Getter
@Configuration
//@TestPropertySource("classpath:bootstrap.properties")
public class BootStrapConstants {

    private static String BOOTSTRAP_PROPERTIES_PATH;

    @Value("${webdriver.chrome.driver}")
    private String chromePath;

    @Value("${webdriver.firefox.driver}")
    private String firefoxPath;

    @Value("${webdriver.edge.driver}")
    private String edgePath;

    @Value("${webdriver.ie.driver}")
    private String iePath;

    @Value("${pageLoadWait}")
    private String pageLoadWait;

    @Value("${browser}")
    private String browser;
}
