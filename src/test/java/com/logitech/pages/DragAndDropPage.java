package com.logitech.pages;

//import com.logitech.helper.DriverHelper;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class DragAndDropPage {

    private final WebDriver driver;

    @FindBy(id = "column-a")
    public WebElement BoxA;

    @FindBy(id = "column-b")
    public WebElement BoxB;

    @PostConstruct
    public void init() {
        PageFactory.initElements(driver, this);
    }

    public String getValueOfBoxB() {
        return BoxB.getText();
    }


}
