package com.softwaretestingboard.magneto.pages;

import com.softwaretestingboard.magneto.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='Cronus Yoga Pant']")
    WebElement mouseHoverToCronus;
    public void mouseHoverToCronus()
    {
        mouseHoverToElement(mouseHoverToCronus);

    }
    @CacheLookup
    @FindBy(xpath ="(//div[@class='swatch-option text'])[1]")
    WebElement clickOnPantSize;
    public void clickOnPantSize()
    {
        mouseHoverToElementAndClick(clickOnPantSize);


    }

    // Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
    @CacheLookup
    @FindBy(xpath ="(//div[@class='swatch-option color'])[1]")
    WebElement clickOnBlackColour;
    public void clickOnBlackColour()
    {
        mouseHoverToElementAndClick(clickOnBlackColour);

    }

    // Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    @CacheLookup
    @FindBy(xpath ="(//span[contains(text(),'Add to Cart')])[1]")

    WebElement mouseHoverAndClickToAddCart;
    public void mouseHoverAndClickToAddCart()
    {
        mouseHoverToElementAndClick(mouseHoverAndClickToAddCart);

    }

    @CacheLookup
    @FindBy(xpath ="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyTextHeading;
    public String verifyTextHeading()
    {
        return getTextFromElement(verifyTextHeading);
    }

}

