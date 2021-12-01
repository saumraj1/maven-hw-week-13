package com.nopcommerce.demo1.pages.electronicsPage;

import com.nopcommerce.demo1.utility.Utility;
import org.openqa.selenium.By;

public class RegisterResult extends Utility {

    By verifyMessage=By.xpath("//div[@class='result']");
    By clickOnContinue=By.xpath("//a[normalize-space()='Continue']");

    public void verifyMessage(String text){
         getTextFromElement(verifyMessage);
    }
    public void clickOnContinue(String text){
        clickOnElement(clickOnContinue);
    }
}
