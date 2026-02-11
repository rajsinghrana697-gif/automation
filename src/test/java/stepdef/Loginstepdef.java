package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstepdef {
    @Given("^open the browser$")
    public void openTheBrowser() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("open the browser");
    }

    @And("^enter the url$")
    public void enterThrUrl() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter the url");
    }

    @And("^enter the cred$")
    public void enterTheCred() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter the cred");
    }

    @When("^user is clicking on login button$")
    public void userIsClickingOnLoginButton() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is clicking on login button");
    }

    @Then("^user should be able to navigate to homepage$")
    public void userShouldBeAbleToNavigateToHomepage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should be able to navigate to homepage");
    }

    @And("^enter the cred \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterTheCredAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter the cred <args0> <args1>+ agrs0 + agrs1");

    }
}
