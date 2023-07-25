package com.softwaretestingboard.magneto.steps;

import com.softwaretestingboard.magneto.pages.GearPage;
import com.softwaretestingboard.magneto.pages.GearPageShoppingCart;
import com.softwaretestingboard.magneto.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GearPageSteps {

    @Given("I am on gearMenu")
    public void iAmOnGearMenu() {
    }
    @When("I click on productName overnightDuffle")
    public void iClickOnProductNameOvernightDuffle() {
        new GearPage().clickOnProductName();
    }


    @And("I click on AddToCart Button")
    public void iClickOnAddToCartButton() {
        new GearPage().clickOnCartLink();

    }

    @Then("verify the gearpage message {string}")
    public void verifyTheMessage(String arg0) {
    }

    @When("I sentTextToElement to {string}")
    public void iSentTextToElementTo(String arg0) {
        new GearPage().changeQuantityAddtoCart(arg0);
    }

    @And("I click on Cart Link")
    public void iClickOnCartLink() {
        try{
            Thread.sleep(1000);
        }catch (Exception ex){

        }
        new GearPage().clickOnCartLink();
    }

    @Then("verify the product name  {string}")
    public void verifyTheProductName(String arg0) {
        Assert.assertEquals(new GearPageShoppingCart().getProductName().getText(), arg0);
    }

    @Then("verify the Qty {string}")
    public void verifyTheQty(String arg0) {
        Assert.assertEquals(new GearPageShoppingCart().getProductQty().getAttribute("value"), arg0);
    }

    @Then("verify Total Price {string}")
    public void verifyTotalPrice(String arg0) {
        try{
            Thread.sleep(1000);
        }catch (Exception ex){

        }
        Assert.assertEquals(new GearPageShoppingCart().getTotalPrice().getText(), arg0);
    }

    @And("I update the Quantity to {string}")
    public void iUpdateTheQuantityTo(String arg0) {
        new GearPageShoppingCart().updateQty(arg0);
    }

    @When("I click on gearMenu")
    public void iClickOnGearMenu() {
        try{
            Thread.sleep(1000);
        }catch (Exception ex){

        }
        new HomePage().clickOnGearBags();
    }

    @Then("verify the gearPage productName {string}")
    public void verifyTheGearPageProductName(String arg0) {
        Assert.assertEquals(new GearPage().getOvernightDuffleText().getText(), arg0);
    }
}
