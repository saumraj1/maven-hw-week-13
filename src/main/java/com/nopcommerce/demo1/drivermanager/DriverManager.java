package com.nopcommerce.demo1.drivermanager;

import com.nopcommerce.demo1.propertyreader.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class DriverManager {
    public static WebDriver driver;
    public String baseUrl= PropertyReader.getInstance().getProperty("baseUrl");
    public void selectBrowser(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }else{
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(baseUrl);
    }
    public void closeBrowser(){
        if (driver!= null){
            driver.quit();
        }
    }
}
