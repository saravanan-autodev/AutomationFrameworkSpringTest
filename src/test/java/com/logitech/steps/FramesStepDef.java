package com.logitech.steps;

import com.logitech.helper.BrowserHelper;
import com.logitech.pages.FramesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class FramesStepDef {

    @Autowired
    private FramesPage framesPage;

    @Autowired
    private BrowserHelper browserHelper;

    public FramesStepDef(FramesPage framesPage, BrowserHelper browserHelper){
//        this.framesPage=framesPage;
//        this.browserHelper=browserHelper;
    }

    @Then("I click on iFrame")
    public void clickOnIframe() {
        framesPage.clickOnIFrame();
    }

    @Then("I clear the default text from the text area")
    public void clearDefaultText() {
        browserHelper.switchToFrame(framesPage.iFrame);
        framesPage.clearTextFromiFrameTxtArea();
    }

    @Then("I enter the text {string} in the frame text box")
    public void enterTextInFrameTxtArea(String text) {
        framesPage.enterTextInFrameTextArea(text);
    }

    @And("I make the entered text as Bold")
    public void makeTextAsBold() {
        browserHelper.selectAllText(framesPage.iFrameTextArea);
        browserHelper.switchToDefault();
        framesPage.clickOnBoldBtn();
    }
}
