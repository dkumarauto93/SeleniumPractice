package com.qa.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class iFrameWinHandeling {

    static  String appURL ="https://omayo.blogspot.com/";

    public static void main(String[]args){

      WebDriver driver = new ChromeDriver();
      driver.get(appURL);
      driver.manage().window().maximize();
      String baseWindowHandle= driver.getWindowHandle();
      driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
      Set<String> totalWindows = driver.getWindowHandles();



    }



}
