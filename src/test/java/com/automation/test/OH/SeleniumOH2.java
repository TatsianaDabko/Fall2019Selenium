package com.automation.test.OH;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOH2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");

        WebElement searchBox = driver.findElement(By.id("search_query_top"));
        searchBox.sendKeys("tshirt"+ Keys.ENTER);

      //  WebElement subBut =driver.findElement(By.name("submit_search"));
      //  subBut.click();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        WebElement alert = driver.findElement(By.xpath("//p[@class='alert alert-warning']"));
        String actual=alert.getText();
        System.out.println("Message error:"+ actual);

        searchBox.clear();
        searchBox.sendKeys("t-shirt"+ Keys.ENTER);

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        WebElement resCount = driver.findElement(By.className("product-count"));
        System.out.println("Result:"+ resCount.getText());
       // WebElement addToCard = driver.findElement(By.className("button ajax_add_to_cart_button btn btn-default"));
      //  addToCard.click();


      //  driver.quit();



    }
}
