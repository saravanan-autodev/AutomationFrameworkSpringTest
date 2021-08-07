package com.logitech.steps;

import com.logitech.pages.SecurePage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class SecureStepDef {

    @Autowired
    private SecurePage securePage;

    public SecureStepDef(SecurePage securePage){
//        this.securePage=securePage;
    }

    @And("I validate the flash message as {string}")
    public void validateFlashMessage(String expectedMsg) {
        Assert.assertTrue(securePage.getFlashMessage().contains(expectedMsg));
    }
}
