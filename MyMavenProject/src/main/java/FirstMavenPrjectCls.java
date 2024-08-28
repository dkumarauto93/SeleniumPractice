import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FirstMavenPrjectCls {

    static String basePath = "src/User_Folder\\sample_folder\\config.properties";
    static String filepath = "src/User_Folder\\sample_folder\\config.properties";
    static String URL = "src/User_Folder\\sample_folder\\config.properties";
//    static String filepath1 = "D:\\JAVA-Class\\File-Folder-Creation\\Demofile.xlsx";
//    static XSSFWorkbook workbook;
//    static XSSFSheet sheet;
//    static XSSFRow row;
//    static XSSFCell cell;

    public static void main(String[]args) throws IOException {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com/");

//         fle.mkdir();
        //fle.createNewFile();

       //System.out.println(fle.mkdir());
        //System.out.println(fle.getName());
       //System.out.println(fle.isDirectory());
       // System.out.println(fle.createNewFile());
        //System.out.println(fle.getName());


//        FileInputStream fr = new FileInputStream(new File(filepath));
//        FileInputStream fr = new FileInputStream(new File(filepath1));
//
//        FileOutputStream fo = new FileOutputStream(new File(filepath));
//        Properties pr = new Properties();
//        pr.load(fr);
//        System.out.println(pr.getProperty("Browser"));
//        System.out.println(pr.getProperty("URL"));
//        driver.get(pr.getProperty("URL"));
//          workbook = new XSSFWorkbook(fr);
//          sheet = workbook.getSheet("Sheet1");
//          row = sheet.getRow(0);
//          cell = row.getCell(2);
//          String data = cell.getStringCellValue();
//          System.out.println(data);












    }
}
