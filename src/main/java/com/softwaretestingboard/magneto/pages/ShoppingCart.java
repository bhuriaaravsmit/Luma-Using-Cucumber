package com.softwaretestingboard.magneto.pages;

import com.softwaretestingboard.magneto.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement cartText ;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productName ;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement productSize ;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement productColour ;

    public WebElement getCartText() {

        return cartText;
    }

    public WebElement getProductName() {

        return productName;
    }

    public WebElement getProductSize() {

        return productSize;
    }

    public WebElement getProductColour() {

        return productColour;
    }

}

