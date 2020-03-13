package com.automation.test.day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement btn1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        btn1.click();

        WebElement result = driver.findElement(By.id("result"));
        System.out.println(result.getText());
        WebElement btn2 = driver.findElement(By.xpath("//button =[text()='Button2']"));
        btn2.click();
        System.out.println(result.getText());

        WebElement btn3 = driver.findElement(By.xpath("//button[start-with(@id, 'button_')]"));
        btn3.click();
        System.out.println(result.getText());

        WebElement btn4 = driver.findElement(By.xpath("//button[contains(@id, '_button')][1]"));
        btn4.click();
        System.out.println(result.getText());

        WebElement btn5 = driver.findElement(By.xpath("//button[contains(text(), '5')]"));
        btn5.click();
        System.out.println(result.getText());


        driver.quit();
    }
}
