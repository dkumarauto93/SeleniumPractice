package com.qa.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WinHandel {
    static String appURL = "https://omayo.blogspot.com/";

    public static void main(String[]args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(appURL);
        String baseWindowHandle= driver.getWindowHandle();
       // System.out.println(baseWindowHandle);
        driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();


        Set <String> totalWindows = driver.getWindowHandles();
        //System.out.println(totalWindows);
       // System.out.println(totalWindows.size());

       for(String prs : totalWindows) {

           if(!prs.equals(baseWindowHandle)) {
               // System.out.println(driver.getCurrentUrl());

               driver.switchTo().window(prs);
               // System.out.println(driver.getWindowHandles());
               System.out.println(driver.getCurrentUrl());
           }
    }
    }}














