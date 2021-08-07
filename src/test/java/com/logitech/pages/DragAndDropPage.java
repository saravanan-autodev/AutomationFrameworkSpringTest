package com.logitech.pages;

import com.logitech.helper.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@TestComponent
//@ScenarioScope
public class DragAndDropPage {

    @Autowired
    DriverHelper driverHelper;

    private WebDriver driver;

    @FindBy(id = "column-a")
    public WebElement BoxA;

    @FindBy(id = "column-b")
    public WebElement BoxB;

    @PostConstruct
    public void init() {
        this.driver = driverHelper.getDriver();
        PageFactory.initElements(driver, this);
    }

    public String getValueOfBoxB() {
        return BoxB.getText();
    }


}
