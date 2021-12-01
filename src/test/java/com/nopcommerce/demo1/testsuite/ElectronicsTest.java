package com.nopcommerce.demo1.testsuite;

import com.nopcommerce.demo1.pages.electronicsPage.*;
import com.nopcommerce.demo1.pages.computerPage.Homepage;
import com.nopcommerce.demo1.testbase.TestBase;
import org.junit.After;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    Homepage homepage = new Homepage();
    CellPhonePage cellPhonepage = new CellPhonePage();
    PhoneNokiaLumiaPage phonenokiaLumiyaPage = new PhoneNokiaLumiaPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResult registerResult=new RegisterResult();

    @Test
    public void vetifyCellPhonesPagenavigateSuccessfully() {
        homepage.clickOnElectronics();
        homepage.mouseHoverOnCellPhones();
    }

    @Test
    public void verifyTheProductAddSuccessFully() {
        cellPhonepage.getCellPhones("Cell phones");
        cellPhonepage.clickListCellPhone("PhoneList");
        cellPhonepage.ClickOnNokiaLumia("Nokia Lumia 1020");
    }

    @Test
    public void verifyTheProductPhoneNokiaLiniya() {
        phonenokiaLumiyaPage.getPhoneNokiaLumiya("Nokia Lumia 1020");
        phonenokiaLumiyaPage.getThePrice(" $349.00 ");
        phonenokiaLumiyaPage.enterTheQty("2");
        phonenokiaLumiyaPage.clcickAddTocart("ADD TO CART");
        phonenokiaLumiyaPage.getAddToProduct("The product has been added to your shopping cart");
        phonenokiaLumiyaPage.clickOnCloseTheBar(" shopping cart");

    }

    @Test
    public void verifyTheShoppingCartPage() {
        shoppingCartPage.mouseHoverTab("Vart-Lable");
        shoppingCartPage.clickGoToCart("Go to cart");
        shoppingCartPage.getFromTheMessage("Shopping cart");
        shoppingCartPage.getFromTheQty("2");
        shoppingCartPage.verifyheTotal("$698.00");
        shoppingCartPage.clickOnTermsOfServices();


    }

    @Test
    public void verifySignInPage() {
        loginPage.verityWelcomeText("Welcome, Please Sign In!");
        loginPage.clickOnRegisterButton();

    }

    @Test
    public void verifyRegisterformsuccessfull() {
        registerPage.verityTheRegisterText("Register");
        registerPage.clickOnRedioButton("gender-female");
        registerPage.enterFirstName("Rinka");
        registerPage.enterLastName("Shah");
        registerPage.selectDateOfBirth(01);
        registerPage.selectMonthOfBirth(05);
        registerPage.selectYearOfBirth(1985);
        registerPage.enterEmailId("Abcd1234@gmail.com");
        registerPage.enterCompanyName("PrimeTesting");
        registerPage.clickOncheckBox("Newsletter");
        registerPage.enterPassword("*********");
        registerPage.enterConfirmPassword("*********");
        registerPage.clickOnRegistorButton("register-button");
        registerPage.clickOnContinue("Continue");
    }
    @Test
    public void VerifyRegisterCompleted(){
        registerResult.verifyMessage("Your registration completed");
        registerResult.clickOnContinue("Continue");
    }@After
    public void tearDown(){
        closeBrowser();
    }

}
