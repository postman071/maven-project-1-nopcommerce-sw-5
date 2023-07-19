package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopsPage extends Utility
{
    @CacheLookup
    @FindBy(name = "products-orderby")
    By sortZToA;

    @CacheLookup
    @FindBy(name = "products-orderby")
    By sortAToZ;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;

    public void selectSortZToA(String text) {
        Reporter.log("Select sort Z to A" + sortZToA.toString());
        selectByVisibleTextFromDropDown(sortZToA, text);
    }

    public void selectSortAToZ(String text) {
        Reporter.log("Select sort A to Z" + sortAToZ.toString());
        selectByVisibleTextFromDropDown(sortAToZ, text);
    }

    public void clickOnAddToCartButton() {
        Reporter.log("CLick on add to cart button" + addToCart.toString());
        clickOnElement(addToCart);
    }
}
