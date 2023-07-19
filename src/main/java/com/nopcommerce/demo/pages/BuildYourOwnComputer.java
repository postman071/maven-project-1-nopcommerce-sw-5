package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputer extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Build your own computer']")
    By buildYourOwnComputer;
    @CacheLookup
    @FindBy(name = "product_attribute_1")
    By processor;

    @CacheLookup
    @FindBy(name = "product_attribute_2")
    By ram;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hdd;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement vistaPremium;

    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement totalCommander;

    @CacheLookup
    @FindBy(id = "price-value-1")
    By price;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    By productAddedText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='close']")
    WebElement closeButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    By hoverShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart;

    public String getBuildYourOwnComputerText() {
        Reporter.log("Get build your own computer text" + buildYourOwnComputer.toString());
        return getTextFromElement(buildYourOwnComputer);
    }

    public void selectProcessor(String text) {
        Reporter.log("Select processor" + processor.toString());
        selectByVisibleTextFromDropDown(processor, text);
    }

    public void selectRam(String text) {
        Reporter.log("Select ram" + ram.toString());
        selectByVisibleTextFromDropDown(ram, text);
    }

    public void selectHdd() {
        Reporter.log("Select hdd" + hdd.toString());
        clickOnElement(hdd);
    }

    public void selectVistaPremiumOs() {
        Reporter.log("Select vista premium Os" + vistaPremium.toString());
        clickOnElement(vistaPremium);
    }

    public void clickOnTotalCommander() {
        Reporter.log("Click on total command" + totalCommander.toString());
        clickOnElement(totalCommander);
    }

    public String getPrice() {
        Reporter.log("Get price" + price.toString());
        return getTextFromElement(price);
    }

    public void clickOnAddToCart() {
        Reporter.log("Click on add to cart" + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public String getProductAddedText() {
        Reporter.log("Get product added text" + productAddedText.toString());
        return getTextFromElement(productAddedText);
    }

    public void clickOnCloseButton() {
        Reporter.log("Click on close button" + closeButton.toString());
        clickOnElement(closeButton);
    }

    public void mouseHoverOnShoppingCart() {
        Reporter.log("Mouse hover on shopping cart" + hoverShoppingCart.toString());
        mouseHoverToElement(hoverShoppingCart);
    }

    public void clickOnGoToCartButton() {
        Reporter.log("Click on go to cart button" + goToCart.toString());
        clickOnElement(goToCart);
    }
}
