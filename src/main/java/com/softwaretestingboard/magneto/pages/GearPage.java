package com.softwaretestingboard.magneto.pages;

import com.softwaretestingboard.magneto.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement productName;



    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overnightDuffleText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement changedQty;


    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement overnightDuffleMessage ;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink ;


    public void clickOnProductName(){
        clickOnElement(productName);

    }

    public WebElement getOvernightDuffleText() {
        return overnightDuffleText;
    }

    public void changeQuantityAddtoCart(String qty) {

        sendTextToElement(changedQty,qty);
        clickOnElement(addToCart);

    }



    public WebElement getOvernightDuffleMessage() {
        return overnightDuffleMessage;
    }

    public void clickOnCartLink(){

        clickOnElement(shoppingCartLink);



    }

}
