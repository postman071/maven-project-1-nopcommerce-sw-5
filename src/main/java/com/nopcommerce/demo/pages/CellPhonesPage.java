package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhonesPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Cell phones']")
    By cellPhoneText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listViewTab;
    @CacheLookup
    @FindBy(xpath = "//div[3]/div[1]/div[2]/h2[1]/a")
    WebElement nokiaLumia;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Nokia Lumia 1020']")
    By nokiaLumiaText;
    @CacheLookup
    @FindBy(id = "price-value-20")
    By price;
    @CacheLookup
    @FindBy(name = "addtocart_20.EnteredQuantity")
    WebElement changeQuantity;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    By productAddedInShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeButton;
    @CacheLookup
    @FindBy(xpath = "//span[text()='Shopping cart']")
    By hoverOnShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[text()='Go to cart']")
    WebElement clickGoToCart;

    public String getCellPhoneText() {
        Reporter.log("Get cell phone text" + cellPhoneText.toString());
        return getTextFromElement(cellPhoneText);
    }

    public void clickOnListViewTab() {
        Reporter.log("Click on list view tab" + listViewTab.toString());
        clickOnElement(listViewTab);
    }

    public void clickOnNokiaLumiaProduct() {
        Reporter.log("Click on nokia lumia product" + nokiaLumia.toString());
        clickOnElement(nokiaLumia);
    }

    public String verifyNokiaLumiaText() {
        Reporter.log("Verify nokia lumia text" + nokiaLumiaText.toString());
        return getTextFromElement(nokiaLumiaText);
    }

    public String verifyPrice() {
        Reporter.log("Verify price" + price.toString());
        return getTextFromElement(price);
    }

    public void changeTheQuantity() {
        Reporter.log("Change quantity" + changeQuantity.toString());
        driver.findElement(By.name("addtocart_20.EnteredQuantity")).clear();
        sendTextToElement(changeQuantity, "2");
    }

    public void clickOnAddToCartButton() {
        Reporter.log("Click on add to cart" + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String verifyProductAddedInShoppingCartText() {
        Reporter.log("Verify product added in shopping cart text" + productAddedInShoppingCart.toString());
        return getTextFromElement(productAddedInShoppingCart);
    }

    public void clickOnCloseButton() {
        Reporter.log("Click on close button" + closeButton.toString());
        clickOnElement(closeButton);
    }

    public void hoverOnShoppingCartAndClickOnGoToCartButton() {
        Reporter.log("Mouse hover on shopping cart" + hoverOnShoppingCart.toString());
        Reporter.log("Click on go to cart" + clickGoToCart.toString());
        mouseHoverToElement(hoverOnShoppingCart);
        clickOnElement(clickGoToCart);
    }
}
