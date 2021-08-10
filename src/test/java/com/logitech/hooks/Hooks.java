package com.logitech.hooks;

import com.logitech.helper.BrowserHelper;
import io.cucumber.java.Scenario;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Hooks {

    private final WebDriver driver;
    private final BrowserHelper browserHelper;
    //private final Scenario scenario;



//    @Before
    public void init() {
        driver.manage().window().maximize();
    }


//    @After
    public void afterHook() {
        //browserHelper.takeScreenshotOnFailure(scenario);
        driver.quit();
    }

}
