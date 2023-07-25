package com.softwaretestingboard.magneto.pages;

import com.softwaretestingboard.magneto.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

        @CacheLookup
        @FindBy(xpath ="//a[@id='ui-id-6']//span[text()='Gear']")

        WebElement gearMenu;
        @CacheLookup
        @FindBy(xpath ="//span[normalize-space()='Bags']")
        WebElement clickOnBag;
        @CacheLookup
        @FindBy(xpath ="//span[normalize-space()='Men']")
        // Mouse Hover on Men Menu
        WebElement menMenu;
        public void mouseHoverOnMenMenu()
        {
            mouseHoverToElement(menMenu);
        }


        // Mouse Hover on Bottoms
        @CacheLookup
        @FindBy(xpath ="//a[@id='ui-id-18']")
        WebElement mouseHoverOnBottom;

        public void mouseHoverOnBottom()
        {
            mouseHoverToElement(mouseHoverOnBottom);

        }

        // Click on Pants
        @CacheLookup
        @FindBy(xpath ="//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
        WebElement mouseHoverandClickOnPants;
        public void mouseHoverAndClickOnPants()
        {
            mouseHoverToElementAndClick(mouseHoverandClickOnPants);

        }


        // Mouse Hover on Gear Menu
        public void mouseHoverToGearMenu()
        {
            mouseHoverToElement(gearMenu);

        }
        // Click on Bags
        public void mouseHoverAndClickOnBag()
        {
            mouseHoverToElementAndClick(clickOnBag);

        }
        //For women Menu
        @CacheLookup
        @FindBy(xpath ="//span[contains(text(),'Women')]")
        WebElement womenMenu;
        public void mouseHoverOnWomenMenu()
        {
            mouseHoverToElement(womenMenu);

        }
        @CacheLookup
        @FindBy(xpath ="//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
        WebElement womenMenuTops;
        public void mouseHoverOnTops()
        {
            mouseHoverToElement(womenMenuTops);

        }
        @CacheLookup
        @FindBy(xpath ="//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")

        WebElement womenMenuJackets;
        public void mouseHoverAndClickOnJacket()
        {
            mouseHoverToElementAndClick(womenMenuJackets);

        }

        public void clickOnGearBags() {
                mouseHoverToElement(gearMenu);
                mouseHoverToElementAndClick(clickOnBag);
            //    CustomListeners.test.log(Status.PASS,"clickOnGearBags");
        }
    }