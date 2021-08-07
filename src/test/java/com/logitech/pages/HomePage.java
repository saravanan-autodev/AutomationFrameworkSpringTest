package com.logitech.pages;

import com.logitech.helper.DriverHelper;
//import io.cucumber.spring.ScenarioScope;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@ScenarioScope
public class HomePage {

    @Autowired
    DriverHelper driverHelper;

    private WebDriver driver;

    @FindBy(linkText = "Form Authentication")
    WebElement formAuthentication;

    @FindBy(linkText = "Dynamic Loading")
    WebElement dynamicLoading;

    @FindBy(linkText = "Multiple Windows")
    WebElement multipleWindows;

    @FindBy(linkText = "Drag and Drop")
    WebElement dragAndDrop;

    @FindBy(linkText = "Frames")
    WebElement frames;

    @FindBy(linkText = "JavaScript Alerts")
    WebElement javaScriptAlerts;

    @PostConstruct
    private void init() {
        this.driver = driverHelper.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void clickOnHyperLink(String linkText) {
        switch (linkText) {
            case "Form Authentication":
                this.formAuthentication.click();
                break;
            case "Dynamic Loading":
                this.dynamicLoading.click();
                break;
            case "Multiple Windows":
                this.multipleWindows.click();
                break;
            case "Drag and Drop":
                this.dragAndDrop.click();
                break;
            case "Frames":
                this.frames.click();
                break;
            case "JavaScript Alerts":
                this.javaScriptAlerts.click();
                break;
            default:
                throw new NoSuchElementException(linkText);
        }
    }

}
