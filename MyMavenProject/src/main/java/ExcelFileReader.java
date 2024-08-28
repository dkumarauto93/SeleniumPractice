import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.Properties;

public class ExcelFileReader {
    static String filepath1 = "D:\\JAVA-Class\\File-Folder-Creation\\Demofile.xlsx";
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    static XSSFRow row;
    static XSSFCell cell;

    public static void main(String[]args) throws IOException {
        FileInputStream fr = new FileInputStream(new File(filepath1));
        workbook = new XSSFWorkbook(fr);
        sheet = workbook.getSheet("Sheet1");
        row = sheet.getRow(0);
        cell = row.getCell(2);
        String data = cell.getStringCellValue();
        System.out.println(data);










    }
}
