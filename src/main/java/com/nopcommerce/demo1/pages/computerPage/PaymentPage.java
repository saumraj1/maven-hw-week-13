package com.nopcommerce.demo1.pages.computerPage;

import com.nopcommerce.demo1.utility.Utility;
import org.openqa.selenium.By;

public class PaymentPage extends Utility {

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


    public void clickOnRadioButtonNextDay() {
        clickOnElement(clickOnPaymentNextDay);
    }

    public void clickOnContinuePaymentMethod() {
        clickOnElement(clickOnPaymentMethod);
    }

    public void clickOnRadoiButtonCreditCard() {
        clickOnElement(clickOnCreditCard);
    }

    public void clickOnPaymentButton() {
        clickOnElement(clickOnpaymentButton);
    }

    public void selectByDropDownCreditCardType(String text) {
        clickOnElement(selectCreditCard);
    }
    public void enterCardHolderName(String text){
        sendTextToElement(enterCardHolderName,"name");
    }
    public void enterCardNumber(String text){
        sendTextToElement(enterCardNumber,"cardnumber");
    }
    public void selectByDropDownExpMonth(String text){
        clickOnElement(expireMonth);
    }
    public void selectByDropDownExpYear(String text){
        clickOnElement(expireYear);
    }
    public void enterCardCode(String text){
        sendTextToElement(enterCardCode,"number");
    }
    public void clickOnpaymentButton(){
        clickOnElement(clickOnPayment);
    }
}