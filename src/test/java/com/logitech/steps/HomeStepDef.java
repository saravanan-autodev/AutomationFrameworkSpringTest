package com.logitech.steps;

import com.logitech.helper.BrowserHelper;
import com.logitech.helper.PropertyUtil;
import com.logitech.pages.HomePage;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

//import static com.logitech.constants.BootStrapConstants.PAGE_LOAD_WAIT;
//import static com.logitech.constants.EnvironmentConstants.HEROKUAPP_URL;

//@ContextConfiguration("classpath:*Cucumber.xml")
//@RunWith(SpringRunner.class)
@RequiredArgsConstructor
public class HomeStepDef {

    private final WebDriver driver;
    private final HomePage homePage;

    @Autowired
    private BrowserHelper browserHelper;

    @Autowired
    private Scenario scenario;

//    @Before
    public void init(Scenario scenario) {
        this.scenario = scenario;
    }


    @Given("I invoke Herokuapp URL")
    public void invokeHerokuApp() {
//        driver.get(PropertyUtil.getProperty(HEROKUAPP_URL));
//        driver.manage().timeouts().pageLoadTimeout(Long.parseLong(PropertyUtil.getBootStrapProperty(PAGE_LOAD_WAIT)), TimeUnit.MILLISECONDS);
    }

    @When("I click on {string}")
    public void clickHyperLink(String linkText) {
        homePage.clickOnHyperLink(linkText);
    }


    @And("I take screenshot of the page")
    public void takeScreenShot() {
        browserHelper.takeScreenshot(scenario);
    }

}
