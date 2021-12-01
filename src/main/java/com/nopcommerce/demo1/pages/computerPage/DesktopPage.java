package com.nopcommerce.demo1.pages.computerPage;

import com.nopcommerce.demo1.utility.Utility;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {
    By DesktopsText = By.xpath("//h1[normalize-space()='Desktops']");
    By productsorderby = By.id("//select[@id='products-orderby'],'Name Z to A'");
    By VerifyProducDescending = By.xpath("//option[normalize-space()='Name: Z to A']");


    public void getDeskTopText() {
        clickOnElement(DesktopsText);
    }

    public void selectDropDownProductSort(String text) {
        clickOnElement(productsorderby);
    }

    public String getprodectdescending(String Name) {
        return getTextFromElement(VerifyProducDescending);


    }


}
