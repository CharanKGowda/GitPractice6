package com.mindtree.seleniumclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          //modifying for jenkins
          //implicit wait
          //driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
          WebDriverWait d = new WebDriverWait(driver,4);
          driver.get("https://www.google.com/");
          driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mindtree");
          d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@value='Google Search']")));
          driver.findElement(By.xpath("//input[@value='Google Search']")).click();
          System.out.println();
          /*driver.findElement(By.cssSelector("input[value='Google Search']")).submit();*/
          
	}

}
