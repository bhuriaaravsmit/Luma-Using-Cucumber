package com.softwaretestingboard.magneto.steps;

import com.softwaretestingboard.magneto.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageSteps {


    @Given("I am on HomePage")
    public void iAmOnHomePage() {
    }


    @When("I mouseHover on WomenMenu")
    public void iMouseHoverOnWomenMenu() {
        try{
            Thread.sleep(1000);
        }catch(Exception ex){

        }
        new HomePage().mouseHoverOnWomenMenu();

    }



    @And("I mouseHover and click on jackets")
    public void iMouseHoverAndClickOnJackets() {
        new HomePage().mouseHoverAndClickOnJacket();
    }

    @When("I mouseHover on men")
    public void iMouseHoverOnMen() {
        try{
            Thread.sleep(1000);
        }catch(Exception ex){

        }
        new HomePage().mouseHoverOnMenMenu();
    }

    @And("I mouseHover on bottoms")
    public void iMouseHoverOnBottoms() {
        new HomePage().mouseHoverOnBottom();
    }

    @And("I mouseHover and click on pants")
    public void iMouseHoverAndClickOnPants() {
        new HomePage().mouseHoverAndClickOnPants();
    }

    @And("I mouseHover on Tops")
    public void iMouseHoverOnTops() {
        new HomePage().mouseHoverOnTops();
    }

    @When("I mouseHover on gearMenu")
    public void iMouseHoverOnGearMenu() {
        try{
            Thread.sleep(1000);
        }catch(Exception ex){

        }
        new HomePage().mouseHoverToGearMenu();
    }

    @And("I mouseHover and click on bags")
    public void iMouseHoverAndClickOnBags() {
        new HomePage().mouseHoverAndClickOnBag();
    }
}