package com.logitech.pages;

import com.logitech.helper.DriverHelper;
//import io.cucumber.spring.ScenarioScope;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@ScenarioScope
public class WindowPage {

    @Autowired
    DriverHelper driverHelper;

    @FindBy(linkText = "Click Here")
    WebElement clickHere;

    private WebDriver driver;

    @PostConstruct
    public void init() {
        this.driver = driverHelper.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void clickOnClickHere() {
        clickHere.click();
    }
}
