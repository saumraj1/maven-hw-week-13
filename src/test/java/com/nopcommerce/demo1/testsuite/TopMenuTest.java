package com.nopcommerce.demo1.testsuite;

import com.nopcommerce.demo1.pages.computerPage.DesktopPage;
import com.nopcommerce.demo1.pages.computerPage.Homepage;
import com.nopcommerce.demo1.pages.computerPage.ShippingCartPage;
import com.nopcommerce.demo1.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    Homepage homePage = new Homepage();
    DesktopPage desktopPage = new DesktopPage();
    ShippingCartPage shippingcartPage=new ShippingCartPage();



    @Test
    public void verifyclickOnComputerPage() {
        homePage.clickOnComputer();
        homePage.mouseHoverDesktops();

    }

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        //desktoppage.clickOnElement(("Desktops");
        desktopPage.selectDropDownProductSort("Name Z to A");
        desktopPage.getprodectdescending("Verify the Product will arrange in Descending order.");


    }
    @Test
    public void verifyshippingCartPageSuccessfully(){
        homePage.clickOnComputer();
        homePage.mouseHoverDesktops();
        desktopPage.selectDropDownProductSort("Name: Z to A");
        desktopPage.getprodectdescending("Verify the Product will arrange in Descending order.");
        shippingcartPage.selectDropDownProduct("Name: A to Z");
        //shippingcartPage.clickOnElement("AddCartButton");


    }


}