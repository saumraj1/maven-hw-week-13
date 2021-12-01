package com.nopcommerce.demo1.pages.electronicsPage;

import com.nopcommerce.demo1.utility.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {

    By CellPhonesText = By.xpath("//h1[normalize-space()='Cell phones']");
    By ClickOnCellPhoneList=By.xpath("//a[normalize-space()='HTC One M8 Android L 5.0 Lollipop'],//a[normalize-space()='HTC One Mini Blue'],//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    By clickOnNokiaLumia=By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");

    public String getCellPhones(String text){
        return getTextFromElement(CellPhonesText);

    }
    public void clickListCellPhone(String text ){
       clickOnElement(ClickOnCellPhoneList);
    }
    public void ClickOnNokiaLumia(String text){
        clickOnElement(clickOnNokiaLumia);
    }


}