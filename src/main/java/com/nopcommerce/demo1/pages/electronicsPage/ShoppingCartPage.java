package com.nopcommerce.demo1.pages.electronicsPage;

import com.nopcommerce.demo1.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By mouseHoverTab = By.xpath("//span[@class='vart-lable']");
    By clickGoToCart = By.xpath("//h1[contains(text(),'shopping cart')]/parent::div/ancestor::div");
    By verifyTheMessage = By.xpath("//h1[normalize-space()='Shopping cart']");
    By verifyTHeQty = By.id("itemquantity11227");
    By verifyTheTotal = By.xpath("//span[@class='product-subtotal']/parent::td");
    By clickOnTermsOfServices=By.id("termsofservice");
    By clickOnCheckOut=By.id("checkout");



    public void mouseHoverTab(String text) {
        clickOnElement(mouseHoverTab);
    }

    public void clickGoToCart(String text) {
        clickOnElement(clickGoToCart);

    }

    public String getFromTheMessage(String text) {
        return getTextFromElement(verifyTheMessage);
    }

    public String getFromTheQty(String text) {
        return getTextFromElement(verifyTHeQty);
    }

    public void verifyheTotal(String text) {
        getTextFromElement(verifyTheTotal);
    }
    public void clickOnTermsOfServices(){
        clickOnElement(clickOnTermsOfServices);
    }
    public void setClickOnCheckOut(){
        clickOnElement(clickOnCheckOut);
    }



}

