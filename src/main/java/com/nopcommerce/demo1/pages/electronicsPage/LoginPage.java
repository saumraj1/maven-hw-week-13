package com.nopcommerce.demo1.pages.electronicsPage;

import com.nopcommerce.demo1.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By verifyWelcomeText = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']/ancestor::div");
    By clickOnRegisterButton = By.className("button-1 register-button");



    public String verityWelcomeText(String text) {
        return getTextFromElement(verifyWelcomeText);
    }

    public void clickOnRegisterButton(){
        clickOnElement(clickOnRegisterButton);
    }

}
