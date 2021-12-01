package com.nopcommerce.demo1.testsuite;

import com.nopcommerce.demo1.pages.computerPage.*;
import com.nopcommerce.demo1.testbase.TestBase;
import org.junit.After;
import org.testng.annotations.Test;

public class ComputersTest extends TestBase {
    Homepage homePage = new Homepage();
    DesktopPage desktopPage = new DesktopPage();
    ShippingCartPage shippingcartPage = new ShippingCartPage();
    LoginPage loginPage = new LoginPage();
    CheckOutPage checkOutPage=new CheckOutPage();
    PaymentPage paymentPage=new PaymentPage();

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
    public void verifyshippingCartPageSuccessfully() {
        homePage.clickOnComputer();
        homePage.mouseHoverDesktops();
        desktopPage.selectDropDownProductSort("Name: Z to A");
        desktopPage.getprodectdescending("Verify the Product will arrange in Descending order.");
        shippingcartPage.selectDropDownProduct("Name: A to Z");
        shippingcartPage.clickOnAddToCard();
        shippingcartPage.getbuildOnComputer();
        shippingcartPage.clickOnDropDownPro("2.2 GHz Intel Pentium Dual-Core E2200");
        shippingcartPage.clickOnDropDownRam("Ram");
        shippingcartPage.clickOnRadioButtonHDD("HDD");
        shippingcartPage.clickOnradioBurttonOS("OS");
        shippingcartPage.clickOnCheckOutBox();//"Microsoft Office [+$50.00]"
        shippingcartPage.clickOnCheckOutBox();//"Total Commander [+$5.00]"
        shippingcartPage.getOnPrice();
        shippingcartPage.clickOnAddToCard();
        shippingcartPage.getVeriftShoppinCart();
        shippingcartPage.clickOnCloseBar();
        shippingcartPage.clickOnQty("2");
        shippingcartPage.getverifyTotal("2,950");
        shippingcartPage.clickOnCheckBoxTerms();
        shippingcartPage.clickOnCheckOutBox();


    }
    @Test
    public void verifyTheSignInPage(){
        loginPage.getWelcomeText();
        loginPage.clickOnCheckOutTab();

    }
    @Test
    public void VerifyTheCheckOutPage(){
        checkOutPage.enterFirstName("Prime");
        checkOutPage.enterLastName("Testing");
        checkOutPage.enterEmail("Xyzw1234@gmail.com");
        checkOutPage.selectOnDropDownCountry("LONDON");
        checkOutPage.enterCity("Harrow");
        checkOutPage.enterAddress("123,TagoreClose");
        checkOutPage.enterPostalCode("HA3 8RB");
        checkOutPage.enterPhoneNumber("07712345678");
        checkOutPage.clickOnContinue();
    }
    @Test
    public void verifyThePaymentMethode(){
        paymentPage.clickOnRadioButtonNextDay();
        paymentPage.clickOnContinuePaymentMethod();
        paymentPage.clickOnRadoiButtonCreditCard();
        paymentPage.clickOnPaymentButton();
        paymentPage.selectByDropDownCreditCardType("MasterCard");
        paymentPage.enterCardHolderName("PritamBhai");
        paymentPage.enterCardNumber("5461237891234567");
        paymentPage.selectByDropDownExpMonth("04");
        paymentPage.selectByDropDownExpYear("2030");
        paymentPage.enterCardCode("789");
        paymentPage.clickOnpaymentButton();


    }
    @After
    public void tearDoen(){
        closeBrowser();
    }



}
