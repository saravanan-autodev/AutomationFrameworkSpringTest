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
public class SecurePage {

    @Autowired
    DriverHelper driverHelper;

    private WebDriver driver;

    @FindBy(id = "flash")
    WebElement flashMessage;

    @PostConstruct
    public void init() {
        this.driver = driverHelper.getDriver();
        PageFactory.initElements(driver, this);
    }

    public String getFlashMessage() {
        return flashMessage.getText().trim();
    }
}
