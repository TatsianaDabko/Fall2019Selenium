package com.automation.test.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RegistrationForm {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/registration_form");

        driver.findElement(By.name("firstname")).sendKeys("Jon");
        driver.findElement(By.name("lastname")).sendKeys("Smit");
        driver.findElement(By.name("username")).sendKeys("Jonny");
        driver.findElement(By.name("email")).sendKeys("jonny@gmail.com");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.name("phone")).sendKeys("123-554-9532");

        List<WebElement> genders = driver.findElements(By.name("gender"));
        genders.get(1).click();

        driver.findElement(By.name("birthday")).sendKeys("11/08/1982");
        driver.findElement(By.name("department")).sendKeys("SDET");
        driver.findElement(By.name("job_title")).sendKeys("SDET");

        driver.findElement(By.id("inlineCheckbox2")).click();
        driver.findElement(By.id("wooden_spoon")).click();

        driver.quit();
    }
}
