package stepdef;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
   public static WebDriver driver;

    public void openBrowser(){
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://sauce-demo.myshopify.com/");
    }
    public void closeBrowser(){
        driver.quit();
    }
}
