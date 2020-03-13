package com.automation.test.day6;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectByTextMultipleOptions {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);

        Select languageSelect = new Select(driver.findElement(By.name("Languages")));
        boolean isMultiple = languageSelect.isMultiple();
        System.out.println(isMultiple);
        languageSelect.selectByVisibleText("JavaScript");
        languageSelect.selectByVisibleText("Python");

        List<WebElement> langSelect = languageSelect.getAllSelectedOptions();
        for(WebElement eachLang: langSelect){
            System.out.println(eachLang.getText());
        }
        languageSelect.deselectByVisibleText("JavaScript");
        languageSelect.deselectAll();

        driver.quit();
    }
}
