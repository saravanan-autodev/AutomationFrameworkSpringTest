package com.logitech.springtest;

import com.logitech.constants.EnvironmentConstants;
import com.logitech.helper.DriverHelper;
import com.logitech.helper.PropertyUtil;
import com.logitech.pages.HomePage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//import static com.logitech.constants.EnvironmentConstants.HEROKUAPP_URL;

@SpringBootTest
public class SpringTestRunner {

    @Autowired
    DriverHelper driverHelper;

    @Autowired
    EnvironmentConstants environmentConstants;

    @Autowired
    HomePage homePage;

    @Test
    public void loadUrl(){
        System.out.println("URL"+environmentConstants.HEROKUAPP_URL);
        driverHelper.getDriver().get(environmentConstants.HEROKUAPP_URL);
        homePage.clickOnHyperLink("Form Authentication");
    }


}
