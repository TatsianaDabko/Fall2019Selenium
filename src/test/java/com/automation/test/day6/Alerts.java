package com.automation.test.day6;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Alerts {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        BrowserUtils.wait(3);
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        buttons.get(0).click();
        String popupText = driver.switchTo().alert().getText();
        System.out.println(popupText);
        driver.switchTo().alert().accept();

        buttons.get(1).click();
        driver.switchTo().alert().dismiss();
        String expected = "You clicked: Cancel";
        String actual = driver.findElement(By.id("result")).getText();
        if(expected.equals(actual)){
            System.out.println("Test passed");
        }else{
            System.out.println("test failed");
        }

        buttons.get(2).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello word!");
        alert.accept();

        String expected1 = "Hello word!";
        String actual1 =  driver.findElement(By.id("result")).getText();
        if(actual1.endsWith(expected1)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
            System.out.println("Expected: "+expected1);
            System.out.println("Actual: " + actual1);
        }

        driver.quit();
    }
}
