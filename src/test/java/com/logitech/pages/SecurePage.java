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
public class SecurePage {

    private final WebDriver driver;

    @FindBy(id = "flash")
    WebElement flashMessage;

    @PostConstruct
    public void init() {
        PageFactory.initElements(driver, this);
    }

    public String getFlashMessage() {
        return flashMessage.getText().trim();
    }
}
