package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class Tc_01_Verify_contactUs extends genericmethods {

    @Test
            public void Verify_contactUs() throws IOException, InterruptedException {
        driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
        Screenshot();
        String expected = "Contact";
        WebElement contact = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[2]/h4"));
        String actual = contact.getText();
        Assert.assertEquals(expected, actual, "Verification failed");
        System.out.println("Verification completed");

        Thread.sleep(3000);
    }




}
