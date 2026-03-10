package org.example.sel;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class Yut{

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // 🔎 Search video
        WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("search_query")));
        searchBox.sendKeys("JENNIE LIKE JENNIE");
        searchBox.sendKeys(Keys.ENTER);

        // 🎬 Click first video
        WebElement firstVideo = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("(//ytd-video-renderer//a[@id='video-title'])[1]")));
        firstVideo.click();

        Thread.sleep(6000);

        // ⏭ Skip ad if available
        try {
            WebDriverWait adWait = new WebDriverWait(driver, Duration.ofSeconds(15));

            WebElement skipButton = adWait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.cssSelector(".ytp-ad-skip-button, .ytp-ad-skip-button-modern")));

            skipButton.click();
            System.out.println("Ad skipped");

        } catch (Exception e) {
            System.out.println("No skippable ad found");
        }

        // 🖥 Full screen
        try {
            WebElement fullScreen = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.cssSelector("button.ytp-fullscreen-button")));
            fullScreen.click();
        } catch (Exception e) {
            System.out.println("Fullscreen not clicked");
        }

        // ⏳ Wait for video to finish
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Double duration = (Double) js.executeScript(
                "return document.querySelector('video').duration");

        if (duration != null) {
            long waitTime = duration.longValue() * 1000;
            Thread.sleep(waitTime);
        } else {
            Thread.sleep(30000); // fallback 30 sec
        }

        // ❌ Close browser
        driver.quit();
    }
}