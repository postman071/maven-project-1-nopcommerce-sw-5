package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CartPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    By shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement clearQuantity;
    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement addQuantity;
    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement updateCart;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    By total;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement checkBox;
    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkout;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    By welcomeText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 checkout-as-guest-button']")
    WebElement checkOutAsGuest;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    By verifyShoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'(2)')]")
    By checkQuantity;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    By checkTotal;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement checkbox;
    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkoutBtn;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    By checkWelcomeMessage;
    @CacheLookup
    @FindBy(xpath = "//button[text()='Register']")
    WebElement register;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    By checkShoppingCartText;


    public String getShoppingCartText() {
        Reporter.log("Get shopping cart text" + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public void changeQuantity() {
        Reporter.log("Change quantity" + addQuantity.toString());
        driver.findElement(By.xpath("//input[@value='1']")).clear();
        sendTextToElement(addQuantity, "2");
    }

    public void clickOnUpdateCart() {
        Reporter.log("Click on update cart" + updateCart.toString());
        clickOnElement(updateCart);
    }

    public String getTotal() {
        Reporter.log("Get total" + total.toString());
        return getTextFromElement(total);
    }

    public void clickOnCheckBox() {
        Reporter.log("Click on check box" + checkBox.toString());
        clickOnElement(checkBox);
    }

    public void clickOnCheckoutButton() {
        Reporter.log("Click on checkout button" + checkout.toString());
        clickOnElement(checkout);
    }

    public String getWelcomeText() {
        Reporter.log("Get welcome text" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnCheckoutAsGuest() {
        Reporter.log("Click on checkout as guest" + checkOutAsGuest.toString());
        clickOnElement(checkOutAsGuest);
    }

    public String verifyShoppingCartText() {
        Reporter.log("Verify shopping cart text" + verifyShoppingCartText.toString());
        return getTextFromElement(verifyShoppingCartText);
    }

    public String verifyTheQuantity() {
        Reporter.log("Verify quantity" + checkQuantity.toString());
        return getTextFromElement(checkQuantity);
    }

    public String verifyTheTotal() {
        Reporter.log("Verify total" + checkTotal.toString());
        return getTextFromElement(checkTotal);
    }

    public void clickOnCheckbox() {
        Reporter.log("Click on check box" + checkbox.toString());
        clickOnElement(checkbox);
    }

    public void clickOnCheckoutBtn() {
        Reporter.log("Click on checkout button" + checkoutBtn.toString());
        clickOnElement(checkoutBtn);
    }

    public String verifyWelcomeMessage() {
        Reporter.log("Verify welcome message" + checkWelcomeMessage.toString());
        return getTextFromElement(checkWelcomeMessage);
    }

    public void clickOnRegisterTab() {
        Reporter.log("Click on register tab" + register.toString());
        clickOnElement(register);
    }

    public String checkShoppingCartText() {
        Reporter.log("Check shopping cart text" + checkShoppingCartText.toString());
        return getTextFromElement(checkShoppingCartText);
    }

    public void clickCheckBox(){
        clickOnElement(By.name("termsofservice"));
    }
    public void clickCheckOut(){
        clickOnElement(By.id("checkout"));
    }
}
