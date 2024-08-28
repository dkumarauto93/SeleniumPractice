package com.qa.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxClick {
    static String URL = "https://omayo.blogspot.com/";
    public static void main(String[]args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        List<WebElement> elm  = driver.findElements(By.cssSelector("div.widget-content >input[name='accessories']"));
        System.out.println(elm.size());
        for (WebElement g:elm) {
           if(!g.isSelected());
           g.click();
            Thread.sleep(5000);
        }

    }
}
