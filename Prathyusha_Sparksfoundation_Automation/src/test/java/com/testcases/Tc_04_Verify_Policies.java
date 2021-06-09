package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Tc_04_Verify_Policies extends genericmethods{


    @Test
    public  void Verify_JoinUs() throws IOException, InterruptedException {


        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[2]/ul/li[1]/a")).click();

        Screenshot();

        String  expected ="Summary Of Important Policies At The Sparks Foundation";
        WebElement we =driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/h3/span"));
        String actual_title=we.getText();
        Assert.assertEquals(expected,actual_title,"Verification failed");
        System.out.println("Verification completed");
        Thread.sleep(3000);

   }
}
