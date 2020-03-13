package com.automation.test.OH;

import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class WarmUpDay4 {
    static WebDriver driver;
    public static void main(String[] args) {

       ebayTest();
       amazonTest();
       wikiTest();
        driver.quit();
    }

    public  static void ebayTest(){

        driver = DriverFactory.createDriver("chrome");
        driver.get("https://www.ebay.com/");
        driver.findElement(By.id("gh-ac")).sendKeys("java book");
        driver.findElement(By.id("gh-btn")).click();
        WebElement result = driver.findElement(By.tagName("h1"));
        System.out.println(result.getText());

    }

    public  static void amazonTest(){
        driver = DriverFactory.createDriver("chrome");
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ball");
        driver.findElement(By.className("nav-input")).click();
        String title = driver.getTitle();
        if(title.contains("ball")){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
    }

    public  static void wikiTest(){
        driver = DriverFactory.createDriver("chrome");
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver");
        driver.findElement(By.id("searchButton")).click();
        driver.findElement(By.className("mw-search-result-heading")).click();
        String link = driver.getCurrentUrl();
        if(link.contains("selenium (software)")){
            System.out.println("Link has selenium");
        }else{
            System.out.println("Link doesn`t has software");
        }

    }

}
