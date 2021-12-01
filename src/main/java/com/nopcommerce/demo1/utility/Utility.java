package com.nopcommerce.demo1.utility;

import com.nopcommerce.demo1.drivermanager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class Utility extends DriverManager {
    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }


    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }


    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public void switchToAlert() {
        driver.switchTo().alert();
    }


    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }


    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }


    public String getTextFromAlert() {
        return driver.switchTo().alert().getText();
    }


    public void sendTextToAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }



    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }


    public void selectByValueFromDropDown(By by, String value) {
        new Select(driver.findElement(by)).selectByValue(value);
    }


    public void selectByIndexFromDropDown(By by, int index) {
        new Select(driver.findElement(by)).selectByIndex(index);
    }


    public void selectByContainsTextFromDropDown(By by, String text) {
        List<WebElement> allOptions = new Select(driver.findElement(by)).getOptions();
        for (WebElement options : allOptions) {
            if (options.getText().contains(text)) {
                options.click();
            }
        }
    }




    public void closeAllWindows(List<String> hList, String parentWindow) {
        for (String str : hList) {
            if (!str.equals(parentWindow)) {
                driver.switchTo().window(str).close();
            }
        }
    }


    public void switchToParentWindow(String parentWindowId) {
        driver.switchTo().window(parentWindowId);
    }


    public boolean switchToRightWindow(String windowTitle, List<String> hList) {
        for (String str : hList) {
            String title = driver.switchTo().window(str).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("Found the right window....");
                return true;
            }
        }
        return false;
    }

    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }


    public WebElement waitUntilVisibilityOfElementLocated(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement waitForElementWithFluentWait(By by, int time, int pollingTime){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(time))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(by);
            }
        });
        return element;
    }
    public String gettextfromelements(By by) {
        WebElement message = driver.findElement(by);
        String actualMessage = message.getText();
        return actualMessage;
//return driver.findElement().gettext();
    }
    public void verifyText(String expectedMessage, String MessageLabel, By by) {
        String actualMessage = getTextFromElement(by);
        Assert.assertEquals(MessageLabel, expectedMessage, actualMessage);

    }
    public void verifyTheText(String expTxt, By by) {
        String actualMsg = getTextFromElement(by);
        Assert.assertEquals(expTxt, actualMsg);
    }




}
