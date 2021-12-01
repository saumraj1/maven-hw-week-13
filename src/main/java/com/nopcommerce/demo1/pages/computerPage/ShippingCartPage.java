package com.nopcommerce.demo1.pages.computerPage;

import com.nopcommerce.demo1.utility.Utility;
import org.openqa.selenium.By;

import java.awt.*;

public class ShippingCartPage extends Utility {
    // By ShoppingCartText= By.linkText("shopping cart");
    By productName = By.xpath("//span[@id='price-value-1\"), \"Name: A to Z");
    By AddCartButton=By.linkText("button-2 product-box-add-to-cart-button");

    By verifyBuildOnComputer = By.xpath("//h1[normalize-space()=']");
    By processor = By.name("product_attribute_1");
    By Ram = By.name("product_attribute_2");
    By HDD = By.name("product_attribute_3");
    By Os = By.id("//input[@id='product_attribute_4_9']");
    By software1 = By.id("product_attribute_5_10");
    By software2 = By.id("product_attribute_5_12");
    By verifyprice = By.xpath("//span[@id='price-value-1");

    By addtToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By productaddverify = By.xpath("//p[@class]='context']");
    By closeThebar = By.xpath("//span[@title='close']");
    By shoppingCartText = By.xpath("//span[@title='cart-lable']");
    By goToCartButton = By.xpath("//button[normalize-space()='Go To cart']");
    By VerifyMassage = By.xpath("//h1[normalize-space()='shopping cart']");
    By changeTheQty = By.xpath("//input[@id='itemquantity11274']");
    By updateShoppingCart = By.xpath("//button[normalize-space()='Update shopping cart']");
    By VerifyTheTotal = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,870.00']");
    By agreeTermsOfService = By.xpath("//input[@id='tearmsofservice']");
    By checkOut = By.xpath("//button[@id='checkout']");

 public void selectDropDownProduct(String text){
     clickOnElement(productName);
 }
 public void clickOnAddCartButton(String text){
     clickOnElement(AddCartButton);
 }
    public String getbuildOnComputer() {
        return getTextFromElement(verifyBuildOnComputer);
    }

    public void clickOnDropDownPro(String text) {
        clickOnElement(processor);
    }

    public void clickOnDropDownRam(String text){
        clickOnElement(Ram);
    }

    public void clickOnRadioButtonHDD(String text) {
        clickOnElement(HDD);
    }

    public void clickOnradioBurttonOS(String text) {
        clickOnElement(Os);
    }

    public void selectOnCheckBox(String text) {
        clickOnElement(software1);
        clickOnElement(software2);
    }

    public String getOnPrice() {
        return getTextFromElement(verifyprice);
    }

    public void clickOnAddToCard() {
        clickOnElement(addtToCart);
    }

    public String getOnMessage() {
        return getTextFromElement(productaddverify);
    }

    public void clickOnCloseBar() {
        clickOnElement(closeThebar);
    }

    public void mouseHoverandClck() {
        clickOnElement(shoppingCartText);
    }

    public void clickOnGoToCartButton() {
        clickOnElement(goToCartButton);
    }

    public String getVeriftShoppinCart() {
        return getTextFromElement(VerifyMassage);
    }

    public void clickOnQty(String text) {
        clickOnElement(changeTheQty);
    }

    public void clickOnUpdateCart() {
        clickOnElement(updateShoppingCart);
    }

    public String getverifyTotal(String text) {
        return getTextFromElement(VerifyTheTotal);
    }

    public void clickOnCheckBoxTerms() {
        clickOnElement(agreeTermsOfService);
    }

    public void clickOnCheckOutBox() {
        clickOnElement(checkOut);
    }




}
