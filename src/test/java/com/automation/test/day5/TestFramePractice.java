package com.automation.test.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFramePractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/iframe");

        driver.switchTo().frame("mce_0_ifr");
        WebElement textInpit = driver.findElement(By.id("tinymce"));
        System.out.println(textInpit.getText());
        textInpit.clear();
        textInpit.sendKeys("Hello, World!!!");
        WebElement heading = driver.findElement(By.tagName("h3"));
        System.out.println(heading.getText());


        driver.switchTo().defaultContent();


        driver.quit();
    }
}
