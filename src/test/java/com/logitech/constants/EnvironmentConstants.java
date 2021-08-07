package com.logitech.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.test.context.TestPropertySource;

import java.io.File;

@Configuration
//@TestPropertySource()
public class EnvironmentConstants {

    public static String PROPERTIES_PATH;

    @Value( "${naukriUrl}" )
//    public static String NAUKRI_URL = "naukriUrl";
    public String NAUKRI_URL;

    @Value( "${herokuapp.url}" )
//    public static String HEROKUAPP_URL = "herokuapp";
    public String HEROKUAPP_URL;

    @Value( "${banners}" )
//    public static String BANNERS_SERVICE = "banners";
    public String BANNERS_SERVICE;
}
