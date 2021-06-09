package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Tc_05_Verify_Student_mentorship extends genericmethods{

    @Test
    public  void Verify_JoinUs() throws IOException, InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[3]/ul/li[2]/a")).click();

        Screenshot();

        String  expected ="Student Mentorship Program";
        WebElement title =driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/h3/span"));
        String actual_title=title.getText();
        Assert.assertEquals(expected,actual_title,"Verification failed");
        System.out.println("Verification completed");
        Thread.sleep(3000);

    }
}
