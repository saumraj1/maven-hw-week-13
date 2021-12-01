package com.nopcommerce.demo1.pages.electronicsPage;

import com.nopcommerce.demo1.utility.Utility;
import org.openqa.selenium.By;

public class PhoneNokiaLumiaPage extends Utility {

    By verifyPhoneNokiaLumiya1020=By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By verifyThePrice=By.id("price-value-20");
    By changeTheQty=By.id("product_enteredQuantity_20");
    By clickAddtoCart=By.id("button[@id='add-to-cart-button-20']");
    By verifyAddToProduct=By.xpath("//a[normalize-space()='shopping cart']");
    By clickCloseTheBar=By.xpath("//span[@title='Close']");


    public String getPhoneNokiaLumiya(String text){
        return getTextFromElement(verifyPhoneNokiaLumiya1020);
    }
    public String getThePrice(String text){
        return getTextFromElement(verifyThePrice);
    }

    public void enterTheQty(String text){
        sendTextToElement(changeTheQty,"2");
    }
    public void clcickAddTocart(String text){
        clickOnElement(clickAddtoCart);
    }
    public String getAddToProduct(String text){
        return getTextFromElement(verifyAddToProduct);
    }
    public void clickOnCloseTheBar(String text){
        clickOnElement(clickCloseTheBar);
    }
}
