package com.testcases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class genericmethods {

    public static WebDriver driver;

    @BeforeTest
    public static void openbrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver.exe");
       driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.thesparksfoundationsingapore.org/");
        Thread.sleep(5000);
    }

    @AfterTest
    public static void closebrowser(){
        driver.close();
    }

    public static void Screenshot() throws IOException {

        DateFormat dateFormat = new SimpleDateFormat("MMddyyyy_HHmmss");

        Date date = new Date();

        // Now format the date
        String date1= dateFormat.format(date);

        System.out.println(date1);
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\test\\IdeaProjects\\screenshot\\"+date1+"_ss.jpg"));
    }
}
