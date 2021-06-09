package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Tc_02_Verify_Vission_Mission extends  genericmethods {

    @Test
    public void Verify_Vission_Mission() throws IOException, InterruptedException {

        driver.findElement(By.xpath("//a[@class='dropdown-toggle menu__link']")).click();
        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[1]/ul/li[1]/a")).click();

        Screenshot();

        String expected = "Vision, Mission And Values";

        WebElement title = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/h2"));
        String actual_title = title.getText();
        Assert.assertEquals(expected, actual_title, "Verification failed");
        System.out.println("Verification completed");
        Thread.sleep(3000);
    }
}
