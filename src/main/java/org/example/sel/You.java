package org.example.sel;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class You {

        public static void main(String[] args) {

                WebDriver driver = new ChromeDriver();
                
                driver.manage().window().maximize();
                driver.get("https://www.facebook.com/");
                driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rajsingh234@gmail.com");
                driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
                driver.findElement((By.xpath("//span//span[contains(text(),'Log in')]"))).click();
        }
}


