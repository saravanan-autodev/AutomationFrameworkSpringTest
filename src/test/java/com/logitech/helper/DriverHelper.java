package com.logitech.helper;

//import io.cucumber.spring.ScenarioScope;
import com.logitech.constants.BootStrapConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static com.logitech.constants.BootStrapConstants.*;

@Component
//@ScenarioScope
public class DriverHelper {

    @Autowired
    BootStrapConstants bootStrapConstants;

    private WebDriver driver;

    @PostConstruct
    public void init() {
        setDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }


    private void setDriver() {
        String browserType;

        if (System.getProperty("browser") != null && !"".equals(System.getProperty("browser"))) {
            browserType = System.getProperty("browser");
        } else
            browserType = bootStrapConstants.browser;

        switch (browserType.toLowerCase()) {
            case "chrome":
//                System.setProperty("webdriver.chrome.driver", PropertyUtil.getBootStrapProperty(CHROME_PATH));
                System.setProperty("webdriver.chrome.driver", bootStrapConstants.CHROME_PATH);
                driver = new ChromeDriver();
                break;
            case "firefox":
//                System.setProperty("webdriver.gecko.driver", PropertyUtil.getBootStrapProperty(FIREFOX_PATH));
                System.setProperty("webdriver.gecko.driver", bootStrapConstants.FIREFOX_PATH);
                driver = new FirefoxDriver();
                break;
            case "ie":
//                System.setProperty("webdriver.ie.driver", PropertyUtil.getBootStrapProperty(IE_PATH));
                System.setProperty("webdriver.ie.driver", bootStrapConstants.IE_PATH);
                driver = new InternetExplorerDriver();
                break;
            case "edge":
//                System.setProperty("webdriver.edge.driver", PropertyUtil.getBootStrapProperty(EDGE_PATH));
                System.setProperty("webdriver.edge.driver", bootStrapConstants.EDGE_PATH);
                driver = new EdgeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                throw new RuntimeException("UnSupported Browser Type - " + browserType);
        }
    }
}
