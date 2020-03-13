package com.automation.test.day5;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonsTest {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        driver.manage().window().maximize();
        BrowserUtils.wait(4);
        WebElement blackButton = driver.findElement(By.id("black"));
        if(blackButton.isDisplayed()&&blackButton.isEnabled()) {
            System.out.println("CLICKED ON BLACK BUTTON");
            blackButton.click();
        }else{
            System.out.println("FAILED TO CLICK ON BLACK BUTTON");
        }
        if(blackButton.isSelected()){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }


        driver.quit();
    }
}
