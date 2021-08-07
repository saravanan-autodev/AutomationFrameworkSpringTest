package com.logitech.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
//@TestPropertySource("classpath:bootstrap.properties")
public class BootStrapConstants {

    public static String BOOTSTRAP_PROPERTIES_PATH;

    @Value( "${webdriver.chrome.driver}" )
//    public static String CHROME_PATH = "webdriver.chrome.driver";
    public String CHROME_PATH;

    @Value( "${webdriver.firefox.driver}" )
//    public static String FIREFOX_PATH = "webdriver.firefox.driver";
    public String FIREFOX_PATH;

    @Value( "${webdriver.edge.driver}" )
//    public static String EDGE_PATH = "webdriver.edge.driver";
    public String EDGE_PATH;

    @Value( "${webdriver.ie.driver}" )
//    public static String IE_PATH = "webdriver.ie.driver";
    public String IE_PATH;

    @Value( "${pageLoadWait}" )
//    public static String PAGE_LOAD_WAIT = "pageLoadWait";
    public String PAGE_LOAD_WAIT;

    @Value("${browser}")
    public String browser;
}
