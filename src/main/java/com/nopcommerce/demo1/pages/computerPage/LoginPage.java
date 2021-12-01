package com.nopcommerce.demo1.pages.computerPage;

import com.nopcommerce.demo1.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkOutText=By.xpath("//button[normalize-space()='Checkout as Guest']");

  /*  By emailField = By.id("Email");
    By passwordField = By.name("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");*/


    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
    public void clickOnCheckOutTab(){
        clickOnElement(checkOutText);
    }

   /* public void enterEmailId(String email) {
        sendTextToElement(emailField, "email");
    }

    public void enterpassword(String password) {
        sendTextToElement(passwordField, "password");
    }

    public void clicklLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMsg() {
        return gettextfromelements(errorMessage);
    }*/
}
