package com.qa;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGSample {
    @BeforeTest
    public void setUP(){
        System.out.println("inside the Before Test");
    }



    @Test
    public void firstTest() {
        System.out.println("inside the firstTest");
    }


    @Test
    public void scoundTest(){
        System.out.println("inside the 2ndTest Test");
    }


    @AfterTest
    public void afterTest(){
        System.out.println("inside the afterTest");
    }

}



