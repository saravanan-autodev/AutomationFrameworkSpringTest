package com.logitech.pages;

//import io.cucumber.spring.ScenarioScope;
import lombok.RequiredArgsConstructor;
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
public class LoginPage {

    private final WebDriver driver;

    @FindBy(name = "username")
    WebElement userNameTxtBx;

    @FindBy(name = "password")
    WebElement passwordTxtBx;

    @FindBy(xpath = "//*[normalize-space(text())=\"Login\"]/parent::button")
    WebElement loginBtn;

    @FindBy(xpath = "//h4/em[1]")
    WebElement userNameValue;

    @FindBy(xpath = "//h4/em[2]")
    WebElement passwordValue;

    @PostConstruct
    public void init() {
        PageFactory.initElements(driver, this);
    }

    public String getUserNameValue() {
        return userNameValue.getText();
    }

    public String getPasswordValue() {
        return passwordValue.getText();
    }

    public void enterUserName() {
        userNameTxtBx.sendKeys(userNameValue.getText());
    }

    public void enterPassword() {
        passwordTxtBx.sendKeys(passwordValue.getText());
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }
}
