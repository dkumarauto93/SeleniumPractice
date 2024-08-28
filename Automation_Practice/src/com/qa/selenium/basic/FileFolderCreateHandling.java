package com.qa.selenium.basic;

import java.io.File;
import java.io.IOException;

import static java.io.File.createTempFile;

public class FileFolderCreateHandling {


    static String basePath = "D:\\JAVA-Class\\File-Folder-Creation\\SampleFile\\test.txt";
    public static void main(String[]args) throws IOException {

        File fle = new File(basePath);
       fle.mkdir();

       System.out.println(fle.mkdir());
       System.out.println(fle.getName());
        System.out.println(fle.isDirectory());
        System.out.println(fle.createNewFile());
       System.out.println(fle.getName());
//       System.out.println(fle.isFile());
//       System.out.println(fle.getPath());
//       //System.out.println(fle.delete());
//       System.out.println(fle.getPath());
//       System.out.println(fle.exists());
//       System.out.println(fle.getName());










    }


}
