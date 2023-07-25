package com.softwaretestingboard.magneto.steps;

import com.softwaretestingboard.magneto.pages.MenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MenPageSteps {
    @Given("I am on menMenu")
    public void iAmOnMenMenu() {
    }


    @When("I mouseHoverToCronus")
    public void iMouseHoverToCronus() {

        try{
            Thread.sleep(1000);
        }catch(Exception ex){

        }

        new MenPage().mouseHoverToCronus();
    }

    @And("I click On PantSize")
    public void iClickOnPantSize() {
        new MenPage().clickOnPantSize();

    }

    @And("I Click On BlackColour")
    public void iClickOnBlackColour() {

        new MenPage().clickOnBlackColour();
    }

    @And("I mouseHover and ClickTo Add To Cart")
    public void iMouseHoverAndClickToAddToCart() {

       new MenPage().mouseHoverAndClickToAddCart();
    }

    @Then("verify the message {string}")
    public void verify_the_message(String message) {

        Assert.assertEquals(new MenPage().verifyTextHeading(),message);
    }


}
