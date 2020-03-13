package com.automation.test.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxesTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");

        List<WebElement> checkBoxes = driver.findElements(By.id("checkboxes"));
        checkBoxes.get(0).click();
            if(checkBoxes.get(0).isSelected()){
                System.out.println("Selected 1 checkbox");
            }else{
                System.out.println("Selected 2 checkbox");
            }




        driver.quit();
    }
}
