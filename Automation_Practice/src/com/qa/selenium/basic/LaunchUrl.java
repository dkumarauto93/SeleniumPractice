package com.qa.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUrl {
    //static String appURL = "https://artoftesting.com/samplesiteforselenium";
    static String appURL = "https://omayo.blogspot.com/";

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(appURL);
        String Titel = driver.getTitle();
        driver.findElement(By.cssSelector("form[name='form1'] input[type='text']")).sendKeys("dinesh.kashyap@yahoo.com");
        driver.findElement(By.cssSelector("form[name='form1'] input[type='password']")).sendKeys("@dineshkashyap123");
        System.out.println("The title of application is:"+Titel);  //The title of application is : xyz
        System.out.println("The URL of application is:"+appURL); // The URL of the target application is : "xyz.com"




    }
}