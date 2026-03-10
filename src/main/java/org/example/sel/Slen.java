package org.example.sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Slen {

    public static void main(String[] args) {

        // Create driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // Open Instagram
            driver.get("https://www.instagram.com/");

            // Create wait (30 seconds)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            // Wait for username field
            WebElement username = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.name("username"))
            );
            username.sendKeys("your_email_here");

            // Wait for password field
            WebElement password = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.name("password"))
            );
            password.sendKeys("your_password_here");

            // Wait for login button and click
            WebElement loginButton = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))
            );
            loginButton.click();

            // Optional: wait after login
            wait.until(ExpectedConditions.titleContains("Instagram"));

            System.out.println("Login attempted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close browser after 5 seconds (optional)
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}