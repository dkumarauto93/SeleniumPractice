package com.qa.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    static String URL = "https://omayo.blogspot.com/";
    public static void main(String[]args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.findElements(By.cssSelector("div.widget-content >input[name='gender']"));
        List<WebElement> elm  = driver.findElements(By.cssSelector("div.widget-content >input[name='gender']"));
        System.out.println(elm.size());
        //div.widget-content >input[name='accessories']



        elm.get(0).click();
        Thread.sleep(5000);
        //elm.get(1).click();
        //Thread.sleep(5000);


       //for (WebElement p:elm) {

            //if (!p.isSelected()){
              // System.out.println(p.getText());
//            }


        }







    }

