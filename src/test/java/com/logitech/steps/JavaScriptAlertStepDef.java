package com.logitech.steps;

import com.logitech.helper.BrowserHelper;
import com.logitech.pages.JavaScriptAlertsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class JavaScriptAlertStepDef {

    @Autowired
    private JavaScriptAlertsPage javaScriptAlertsPage;

    @Autowired
    private BrowserHelper browserHelper;

    public JavaScriptAlertStepDef(JavaScriptAlertsPage javaScriptAlertsPage, BrowserHelper browserHelper){
//        this.javaScriptAlertsPage=javaScriptAlertsPage;
//        this.browserHelper=browserHelper;
    }

    @Then("I click on {string} button")
    public void clickOnJsBtn(String btnName) {
        javaScriptAlertsPage.clickOnJsConfirmBtn(btnName);
    }

    @Then("I validate the alert cancelled message as {string}")
    public void validateAlertCancelMessage(String expectedMsg) {
        Assert.assertEquals(expectedMsg, javaScriptAlertsPage.getMessage());
    }

    @And("I cancel the Alert")
    public void cancelAlert() {
        browserHelper.cancelAlert();
    }
}
