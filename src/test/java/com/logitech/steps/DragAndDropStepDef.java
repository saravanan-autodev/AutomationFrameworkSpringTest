package com.logitech.steps;

import com.logitech.helper.BrowserHelper;
import com.logitech.pages.DragAndDropPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lombok.RequiredArgsConstructor;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;

@RequiredArgsConstructor
public class DragAndDropStepDef {

    private final WebDriver driver;
    private final DragAndDropPage dragAndDropPage;
    private final BrowserHelper browserHelper;

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
