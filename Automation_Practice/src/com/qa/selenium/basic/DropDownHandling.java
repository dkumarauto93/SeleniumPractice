package com.qa.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

    //
    static String URL = "https://omayo.blogspot.com";
    public static void main(String[]args){


        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        //WebElement elm = driver.findElement(By.cssSelector("select[id^=drop][name='SiteMap']"));
        WebElement elm2 = driver.findElement(By.cssSelector(""));
        //System.out.println(elm);
        Select sel = new Select(elm2);
        //sel.selectByIndex(0);
        //sel.selectByValue("mno");
        //sel.selectByVisibleText("doc 4");












    }

}
