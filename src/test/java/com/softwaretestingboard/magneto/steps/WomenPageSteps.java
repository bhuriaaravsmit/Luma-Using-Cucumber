package com.softwaretestingboard.magneto.steps;

import com.softwaretestingboard.magneto.pages.HomePage;
import com.softwaretestingboard.magneto.pages.WomenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Collections;
import java.util.List;

public class WomenPageSteps {

    @When("I women mouseHover on WomenMenu")
    public void iMouseHoverOnWomenMenu() {
        try{
            Thread.sleep(1000);
        }catch(Exception ex){

        }
        new HomePage().mouseHoverOnWomenMenu();

    }

    @And("I women mouseHover and click on jackets")
    public void iMouseHoverAndClickOnJackets() {
        try{
            Thread.sleep(1000);
        }catch(Exception ex){

        }
        new HomePage().mouseHoverAndClickOnJacket();
    }
    @And("I women mouseHover on Tops")
    public void iMouseHoverOnTops() {
        try{
            Thread.sleep(1000);
        }catch(Exception ex){

        }
        new HomePage().mouseHoverOnTops();
    }


    @And("the product should sort by product name")
    public void theProductShouldSortByProductName() {
        new WomenPage().sortByProductName();
    }

    @Then("verify the product is displayed in alphabetical order")
    public void verifyTheProductIsDisplayedInAlphabeticalOrder() {
        List<String> jacketsNameListBefore= new WomenPage().getJacketElements();
        List<String> jacketsNameListAfter=new WomenPage().getJacketElements();

        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
        // Verify the products name display in alphabetical order
        Assert.assertEquals(jacketsNameListBefore, jacketsNameListAfter);


    }

    @And("the product should sort price")
    public void theProductShouldSortPrice() {
        new WomenPage().sortByPrice();
    }

    @Then("verify the product is displayed in low to high order")
    public void verifyTheProductIsDisplayedInLowToHighOrder() {

        List<String> jacketsPriceListBefore=new WomenPage().getPriceElements();
        List<String> jacketsPriceListAfter=new WomenPage().getPriceElements();

        Collections.sort(jacketsPriceListBefore);
        // Verify the products price display in Low to High
        Assert.assertEquals(jacketsPriceListBefore, jacketsPriceListAfter);
    }
}
