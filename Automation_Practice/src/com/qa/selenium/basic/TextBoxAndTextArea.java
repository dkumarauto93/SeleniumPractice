package com.qa.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxAndTextArea {

    static String appURL = "https://omayo.blogspot.com/";

    public static void main(String[]args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("textarea[id^='ta']")).sendKeys("This is Dinesh This is Dinesh This is Dinesh This is Dinesh This is Dinesh This is Dinesh This is Dinesh This is Dinesh This is Dinesh This is Dinesh This is Dinesh This is Dinesh This is Dinesh ");
        driver.findElement(By.cssSelector("textarea[id^='ta']")).clear();
        //driver.findElement(By.cssSelector("textarea[id^='ta']")).isDisplayed();
        //System.out.println(driver.findElement(By.cssSelector("textarea[id^='ta']")).isDisplayed());
        //System.out.println(driver.findElement(By.cssSelector("textarea[id^='ta']")).isEnabled());//
        System.out.println("Is Field Displayed or Not:  " + driver.findElement(By.cssSelector("input[id='tb2']")).isDisplayed());
        System.out.println("Is Field Enabled or Not:  " + driver.findElement(By.cssSelector("input[id='tb2']")).isEnabled());
        Thread.sleep(8000);
        driver.quit();






    }

}
