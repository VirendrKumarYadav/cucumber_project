package stepdefinitions;



import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WithdrawCashSteps {

    private int accountBalance;
    private int requestedAmount;

    @Given("I have a balance of ${int} in my account")
    public void i_have_a_balance_in_my_account(int balance) {
        accountBalance = balance;
    }

    @When("I request ${int}")
    public void i_request(int amount) {
        requestedAmount = amount;
    }

    @Then("${int} should be dispensed")
    public void should_be_dispensed(int expectedAmount) {
        if (requestedAmount <= accountBalance) {
            Assert.assertEquals(expectedAmount, requestedAmount, 0);
            accountBalance -= requestedAmount; // Deduct the requested amount
        } else {
        	Assert.assertEquals(false, true);
        }
    }
}
