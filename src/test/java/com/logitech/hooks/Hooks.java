package com.logitech.hooks;

import com.logitech.helper.BrowserHelper;
import com.logitech.helper.DriverHelper;
import io.cucumber.java.Scenario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hooks {

    @Autowired
    private DriverHelper driverHelper;

    @Autowired
    private BrowserHelper browserHelper;

//    @Autowired
    Scenario scenario;

//    @Before
    public void init() {
        driverHelper.getDriver().manage().window().maximize();
    }


//    @After
    public void afterHook() {
        browserHelper.takeScreenshotOnFailure(scenario);
        driverHelper.getDriver().quit();
    }

}
