package com.automation.test.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementByID {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(2000);

        String expected = "Welcome to the Secure Area. When you are done click logout below.";
        String actual = driver.findElement(By.tagName("h4")).getText();
        if(expected.equals(actual)){
            System.out.println("TEST PASSED!");
        }else{
            System.out.println("TEST FAILED!");
        }

        WebElement logout = driver.findElement(By.linkText(" Logout"));
        String href = logout.getAttribute("href");
        String className = logout.getAttribute("class");
        System.out.println(href);
        System.out.println(className);
        logout.click();
        driver.findElement(By.name("Username")).sendKeys("wrong");
        driver.findElement(By.name("password")).sendKeys(" wrong");
        driver.findElement(By.id("wooden_spoon")).click();

        WebElement errorMessage = driver.findElement(By.id("flash-messages"));
        System.out.println(errorMessage.getText());


        driver.quit();

    }

}
