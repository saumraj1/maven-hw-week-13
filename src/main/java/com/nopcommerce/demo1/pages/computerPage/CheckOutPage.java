package com.nopcommerce.demo1.pages.computerPage;

import com.nopcommerce.demo1.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By enterFirstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By enterLastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By enterEmail = By.xpath("//input[@id='BillingNewAddress_Email']");
    By selectCountry = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By enterCity = By.xpath("//input[@id='BillingNewAddress_City']");
    By enterAddress = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By enterPostalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By enterPhoneNember = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By ContiueButton = By.xpath("//button[@onclick='Billing.save()']");

    By clickOnPaymentNextDay = By.xpath("//label[normalize-space()='Next Day Air ()$0.00']");
    By clickOnPaymentMethod = By.xpath("//div[@id='Payment-method-buttons-container']//p[@class='back-link']//a[@href='#']");
    By clickOnCreditCard = By.xpath("//label[normalize-space()='Credit Card']");
    By clickOnpaymentButton = By.xpath("//button[@class='button-1 Payment-method-next-step-button']");

    By selectCreditCard = By.id("CreditCardType");
    By enterCardHolderName = By.id("CardholderName");
    By enterCardNumber = By.id("CardNumber");
    By expireMonth = By.id("ExpireMonth");
    By expireYear = By.id("ExpireYear");
    By enterCardCode = By.name("CardCode");
    By clickOnPayment = By.xpath("//button[@class='button1' payment-info-next-step--button']");

    public void enterFirstName(String name) {
        sendTextToElement(enterFirstName, "name");
    }

    public void enterLastName(String surname) {
        sendTextToElement(enterLastName, "surname");
    }

    public void enterEmail(String email) {
        sendTextToElement(enterEmail, "Email");
    }

    public void selectOnDropDownCountry(String country) {
        clickOnElement(selectCountry);
    }

    public void enterCity(String city) {
        sendTextToElement(enterCity, "city");
    }

    public void enterAddress(String address) {
        sendTextToElement(enterAddress, "address");
    }

    public void enterPostalCode(String postalcode) {
        sendTextToElement(enterPostalCode, "postalcode");
    }

    public void enterPhoneNumber(String phoneNumber) {
        sendTextToElement(enterPhoneNember, "phoneNumber");
    }

    public void clickOnContinue() {
        clickOnElement(ContiueButton);
    }





}
