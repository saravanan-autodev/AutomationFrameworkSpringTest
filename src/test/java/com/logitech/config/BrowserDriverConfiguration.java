package com.logitech.config;

import com.logitech.constants.BootStrapConstants;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BrowserDriverConfiguration {

    private final BootStrapConstants bootStrapConstants;

    @Bean
    @ConditionalOnProperty(value = "browser", havingValue = "chrome", matchIfMissing = false)
    public WebDriver chormeDriver() {
        System.setProperty("webdriver.chrome.driver", bootStrapConstants.getChromePath());
        return new ChromeDriver();
    }

    @Bean
    @ConditionalOnProperty(value = "browser", havingValue = "firefox", matchIfMissing = false)
    public WebDriver firefoxDriver() {
        System.setProperty("webdriver.gecko.driver", bootStrapConstants.getFirefoxPath());
        return new FirefoxDriver();
    }

    @Bean
    @ConditionalOnProperty(value = "browser", havingValue = "ie", matchIfMissing = false)
    public WebDriver internetExplorerDriver() {
        System.setProperty("webdriver.ie.driver", bootStrapConstants.getIePath());
        return new InternetExplorerDriver();
    }

    @Bean
    @ConditionalOnProperty(value = "browser", havingValue = "edge", matchIfMissing = false)
    public WebDriver edgeDriver() {
        System.setProperty("webdriver.edge.driver", bootStrapConstants.getEdgePath());
        return new EdgeDriver();
    }

    @Bean
    @ConditionalOnProperty(value = "browser", havingValue = "safari", matchIfMissing = false)
    public WebDriver safariDriver() {
        return new SafariDriver();
    }
}
