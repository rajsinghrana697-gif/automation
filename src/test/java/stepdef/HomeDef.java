package stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static stepdef.TestBase.driver;

public class HomeDef extends    TestBase {
  @Given("enter the username and password")
    public void enterTheUsernameAndPassword() {
        driver.findElement(By.xpath("//input[@name='customer[email]']")).sendKeys("blaaaa@gmail.com");
        driver.findElement(By.xpath("//input[@name='customer[password]']")).sendKeys("boat");
    }

    @Then("clicking on login button")
    public void clickingOnLoginButton() {
        driver.findElement(By.xpath("//input[@value='Sign In']")).click();
    }

    @Given("click on login tab")
    public void clickOnLoginTab() {
        driver.findElement(By.xpath("//div//nav//a[contains(text(),'Log In')]")).click();
    }

    @Then("verify the title of the page {string}")
    public void verifyTheTitleOfThePage(String arg0) {
        driver.findElement(By.xpath("")).click();
    }

    @Given("click on the catalog")
    public void clickOnTheCatalog() {
        driver.findElement(By.xpath("//div//nav//a[contains(text(),'Catalog')]")).click();
    }

    @Then("choose a product")
    public void chooseAProduct() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Black heels']")));
        element.click();
    }

    @Then("add to cart the product")
    public void addToCartTheProduct() {
        driver.findElement(By.xpath("//div//input[@value='Add to Cart']")).click();
    }

    @Then("user should be able to check the cart details {string}")
    public void userShouldBeAbleToCheckTheCartDetails(String arg0) {
        driver.findElement(By.xpath(""));
    }

    @Then("Validate the numbering on My Cart on clicking on Add to Cart button {string}")
    public void validateTheNumberingOnMyCartOnClickingOnAddToCartButton(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @When("click on checkout button")
    public void clickOnCheckoutButton() throws InterruptedException {
        Thread.sleep(2000L);
        driver.findElement(By.xpath(" //a[@class='checkout'] ")).click();
    }

    @Then("Validate the title of checkout page {string}")
    public void validateTheTitleOfCheckoutPage(String expectedCheckoutPageTitle) {
        String actualCheckoutPageTitle = driver.getTitle();
        Assert.assertEquals(expectedCheckoutPageTitle,actualCheckoutPageTitle);
    }

    @When("User is clicking on checkout button")
    public void userIsClickingOnCheckoutButton() {
        driver.findElement(By.xpath("//input[@name='checkout']")).click();
    }

    @Then("Validate the title of Contact detail and payment page {string}")
    public void validateTheTitleOfContactDetailAndPaymentPage(String expectedPaymentDetailPageTitle) {
        String actualPaymentDetailPageTitle= driver.getTitle();
        Assert.assertEquals(expectedPaymentDetailPageTitle,actualPaymentDetailPageTitle);
    }

    @When("User is entering Contact Detail")
    public void userIsEnteringContactDetail()  {

        driver.findElement(By.xpath("//div//input[@name='email']")).sendKeys("pirates@gmail.com");
        driver.findElement(By.xpath("//div//input[@name='firstName']")).sendKeys("parth");
        driver.findElement(By.xpath("//div//input[@placeholder='Last name']")).sendKeys("pandita");
        driver.findElement(By.xpath("//div//input[@placeholder='Company (optional)']")).sendKeys("men Company");
        driver.findElement(By.xpath("//div//input[@placeholder='Address']")).sendKeys("lane 1 block 2");
        driver.findElement(By.xpath("//div//input[@placeholder='Apartment, suite, etc. (optional)']")).sendKeys("asdfghjk");
        driver.findElement(By.xpath("//div//input[@placeholder='City']")).sendKeys("Amritsar");
        driver.findElement(By.xpath("//input[@placeholder='PIN code']")).sendKeys("143001");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9106549191");
    }

    @And("Click on Pay Now button")
    public void clickOnPayNowButton() {
        driver.findElement(By.xpath("//button[@id='checkout-pay-button']")).click();
    }

    @Then("click on add cart")
    public void clickOnAddCart() {
        driver.findElement(By.xpath("//div//a[@class='toggle-drawer cart desktop 'and contains(text(),'My Cart ')]")).click();
    }

    @Then("enter card details")
    public void enterCardDetails() throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@id,'card-fields-number')]")));
        driver.findElement(By.xpath("//input[@placeholder='Card number']")).sendKeys("111414484234");
        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@id,'card-fields-expiry')]")));
        driver.findElement(By.xpath("//input[@placeholder='Expiration date (MM / YY)']")).sendKeys("111414484234");
        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@id,'card-fields-verification_value')]")));
        driver.findElement(By.xpath("//input[@placeholder='Security code']")).sendKeys("111414484234");
        driver.switchTo().defaultContent();
    }
}

