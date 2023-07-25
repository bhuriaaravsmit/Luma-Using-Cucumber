package com.softwaretestingboard.magneto.pages;

import com.softwaretestingboard.magneto.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPageShoppingCart extends Utility {

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement productQty;


    // @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement totalPrice ;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart ;

    public WebElement getProductName() {


        return productName;
    }

    public WebElement getTotalPrice() {

        return totalPrice;
    }

    public WebElement getProductQty() {


        return productQty;
    }

    public void clickOnProductName(){
        clickOnElement(productName);

    }

    public void updateQty(String qty){
        sendTextToElement(productQty,qty);
        clickOnElement(updateShoppingCart);


    }

}

