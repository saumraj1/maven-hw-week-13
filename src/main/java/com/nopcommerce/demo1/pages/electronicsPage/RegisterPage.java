package com.nopcommerce.demo1.pages.electronicsPage;

import com.nopcommerce.demo1.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By verifyTheRegister = By.xpath("//h1[normalize-space()='Register']/ancestor::div");
    By clickOnRedioButton = By.id("gender-female");
    By enterFirstName = By.id("FirstName");
    By enterLastName = By.id("LastName");
    By selectDateOfBirth = By.name("DateofBirthDay");
    By selectMonthOfBirth = By.name("DateofBirthMonth");
    By selectYearOfBirth = By.name("DateofBirthYear");
    By enterEmailId=By.id("Email");
    By enterCompanyName=By.name("Company");
    By clickOnCheckBox=By.name("Newsletter");
    By enterPassword=By.id("Password");
    By enterConfirmPassword=By.id("ConfirmPassword");
    By clickOnRegistoButton=By.id("register-button");
    By clickOnContinue=By.xpath("//a[normalize-space()='Continue']");


    public String verityTheRegisterText(String text) {
        return getTextFromElement(verifyTheRegister);
    }

    public void clickOnRedioButton(String text) {
        clickOnElement(clickOnRedioButton);
    }

    public void enterFirstName(String text) {
        sendTextToElement(enterFirstName, "Rinka");
    }

    public void enterLastName(String text) {
        sendTextToElement(enterLastName, "Shah");
    }

    public void selectDateOfBirth(int text) {
        selectByVisibleTextFromDropDown(selectDateOfBirth, "01");
    }

    public void selectMonthOfBirth(int text) {
        selectByVisibleTextFromDropDown(selectMonthOfBirth, "05");
    }

    public void selectYearOfBirth(int text) {
        selectByVisibleTextFromDropDown(selectYearOfBirth, "1985");
    }

    public void enterEmailId(String text) {
        sendTextToElement(enterEmailId, "abcd1234@gmail.com");
    }

    public void enterCompanyName(String text) {
        sendTextToElement(enterCompanyName, "PrimeTesting");

    }
    public void clickOncheckBox(String text) {
        clickOnElement(clickOnCheckBox);
    }
    public void enterPassword(String text) {
        sendTextToElement(enterPassword, "*********");
    }
    public void enterConfirmPassword(String text) {
        sendTextToElement(enterConfirmPassword, "*********");
    }
    public void clickOnRegistorButton(String text) {
        clickOnElement(clickOnRegistoButton);
    }
    public void clickOnContinue(String text) {
        clickOnElement(clickOnContinue);
    }
}