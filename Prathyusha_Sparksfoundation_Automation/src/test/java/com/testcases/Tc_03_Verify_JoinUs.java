package com.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Tc_03_Verify_JoinUs extends  genericmethods{

    @Test
    public  void Verify_JoinUs() throws IOException, InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[5]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[5]/ul/li[5]/a")).click();

        Screenshot();

        String expected = "Graduate Rotational Internship Program";
        WebElement we = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/h3[1]/span"));
        String actual_title = we.getText();
        Assert.assertEquals(expected, actual_title, "Verification failed");
        System.out.println("Verification completed");
        Thread.sleep(3000);
    }

}
