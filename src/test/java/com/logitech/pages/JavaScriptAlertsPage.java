package com.logitech.pages;

//import io.cucumber.spring.ScenarioScope;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@ScenarioScope
@RequiredArgsConstructor
public class JavaScriptAlertsPage {

    private final WebDriver driver;

    @FindBy(xpath = "//button[text()=\"Click for JS Confirm\"]")
    WebElement clickJsConfirmBtn;

    @FindBy(xpath = "//*[@id=\"result\"]")
    WebElement message;

    @PostConstruct
    public void init() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnJsConfirmBtn(String btnName) {
        switch (btnName) {
            case "Click for JS Confirm":
                clickJsConfirmBtn.click();
                break;
            default:
                throw new NoSuchElementException(btnName);
        }
    }

    public String getMessage() {
        return message.getText();
    }
}
