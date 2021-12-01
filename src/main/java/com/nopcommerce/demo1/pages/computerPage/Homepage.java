package com.nopcommerce.demo1.pages.computerPage;

import com.nopcommerce.demo1.utility.Utility;
import org.openqa.selenium.By;

import java.awt.*;

public class Homepage extends Utility {
    By Computer = By.linkText("Computers ");
    By Desktop=By.linkText("Desktops");
    By Electronics=By.linkText("Electronics");
    By cellPhones=By.xpath("//h1[normalize-space()='Cell phones'])[1]");


    public void clickOnComputer() {
        clickOnElement(Computer);
    }
    public void mouseHoverDesktops(){

        clickOnElement(Desktop);
    }
    public void clickOnElectronics(){
        clickOnElement(Electronics);
    }
    public void mouseHoverOnCellPhones(){
        clickOnElement(cellPhones);
    }
}
/* ArrayList<String> listName = new ArrayList<>();
        listName.add("Computers");
        listName.add("Electronics");
        listName.add("Apparel");
        listName.add("Digital downloads");
        listName.add("Books");
        listName.add("Jewelry");
        listName.add("Gift Cards");
        for (String print : listName) {
        driver.findElement(By.linkText(print)).click();
        Thread.sleep(2000);

        }
        }*/