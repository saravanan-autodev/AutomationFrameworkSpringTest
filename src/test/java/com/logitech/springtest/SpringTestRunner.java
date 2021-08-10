package com.logitech.springtest;

import com.logitech.constants.EnvironmentConstants;
import com.logitech.pages.HomePage;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

@SpringBootTest
public class SpringTestRunner {

    @Autowired
    private WebDriver driver;

    @Autowired
    private EnvironmentConstants environmentConstants;

    @Autowired
    private HomePage homePage;

    @Test
    public void loadUrl(){
        System.out.println("URL"+environmentConstants.getHerokuappUrl());
        driver.get(environmentConstants.getHerokuappUrl());
        homePage.clickOnHyperLink("Form Authentication");
    }

}
