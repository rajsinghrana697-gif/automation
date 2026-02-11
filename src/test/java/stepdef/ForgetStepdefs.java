package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForgetStepdefs {

    @And("^click on the forget password link$")
    public void clickOnTheForgetPasswordLink() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click on the forget password link");
    }

    @And("^enter the registered email$")
    public void enterTheRegisteredEmail() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter the registered email");
    }

    @When("^user is clicking on submit button$")
    public void userIsClickingOnSubmitButton() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is clicking on submit button");
    }

    @Then("^user should be able to receive reset password link$")
    public void userShouldBeAbleToReceiveResetPasswordLink() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should be able to receive reset password link");
    }

    @And("^enter the unregistered email$")
    public void enterTheUnregisteredEmail() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter the unregistered email");

    }

    @Then("^user should see error message$")
    public void userShouldSeeErrorMessage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should see error message");
    }

    @Then("^user should see validation message for email field$")
    public void userShouldSeeValidationMessageForEmailField() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should see validation message for email field ");
    }

    @And("^enter the email\"([^\"]*)\"$")
    public void enterTheEmail(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter the email args0" );
    }

    @When("^user is clicking on the submit button$")
    public void userIsClickingOnTheSubmitButton() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is clicking on the submit button");
    }

    @Then("^user should see confirmation message$")
    public void userShouldSeeConfirmationMessage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should see confirmation message");
    }

    @Given("^user has received expired reset password link$")
    public void userHasReceivedExpiredResetPasswordLink() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user has received expired reset password link");
    }

    @When("^user click on expired link message$")
    public void userClickOnExpiredLinkMessage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user click on expired link message");
    }

    @Then("^user should see expired link message$")
    public void userShouldSeeExpiredLinkMessage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should see expired link message");
    }

    @Given("^user is on reset password page$")
    public void userIsOnResetPasswordPage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is on reset password page");
    }

    @And("^enter new password$")
    public void enterNewPassword() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter new password");
    }

    @And("^enter different conform password$")
    public void enterDifferentConformPassword() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter different conform password");
    }

    @When("^user click on the reset button$")
    public void userClickOnTheResetButton() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user click on the reset button");
    }


    @When("^user click on reset button$")
    public void userClickOnResetButton() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user click on reset button");
    }

    @Then("^user should see password mismatch message$")
    public void userShouldSeePasswordMismatchMessage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should see password mismatch message");
    }


    @And("^enter password less then required length$")
    public void enterPasswordLessThenRequiredLength() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter password less then required length");
    }

    @Then("^user should see password length validation message$")
    public void userShouldSeePasswordLengthValidationMessage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should see password length validation message");
    }

    @And("^enter password without uppercase character$")
    public void enterPasswordWithoutUppercaseCharacter() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter password without uppercase character");
    }

    @Then("^user should be see password policy message$")
    public void userShouldBeSeePasswordPolicyMessage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should be see password policy message");
    }

    @And("^enter password without numeric value$")
    public void enterPasswordWithoutNumericValue() {
        System.out.println("enter password without numeric value");

    }

    @Then("^user should see password policy message$")
    public void userShouldSeePasswordPolicyMessage() {
        System.out.println("user should see password policy message");
    }
}