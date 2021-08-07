package com.logitech.steps;

import com.logitech.helper.BrowserHelper;
import com.logitech.helper.DriverHelper;
import com.logitech.pages.DragAndDropPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;

public class DragAndDropStepDef {

    private WebDriver driver;

    @Autowired
    private DragAndDropPage dragAndDropPage;

    @Autowired
    private BrowserHelper browserHelper;

    @Autowired
    DriverHelper driverHelper;

    public DragAndDropStepDef(DriverHelper helper,DragAndDropPage dragAndDropPage,BrowserHelper browserHelper){
        this.driver = driverHelper.getDriver();
//        this.dragAndDropPage=dragAndDropPage;
//        this.browserHelper=browserHelper;
    }

    @Then("I drag box A to box B")
    public void dragAtoB() {
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        browserHelper.dragAndDropElements(dragAndDropPage.BoxA, dragAndDropPage.BoxB);
    }

    @And("I validate the header of box B should be {string}")
    public void validateTheHeader(String expectedValue) {
        Assert.assertEquals(expectedValue, dragAndDropPage.getValueOfBoxB());
    }
}
