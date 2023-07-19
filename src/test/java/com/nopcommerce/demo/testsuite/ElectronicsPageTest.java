package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.basetest.BaseTest;
import com.nopcommerce.demo.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElectronicsPageTest extends BaseTest
{
    HomePage homePage;
    CellPhonesPage cellPhonesPage;
    CartPage cartPage;
    RegisterPage registerPage;
    BillingPage billingPage;
    CheckoutPage checkoutPage;
    ConfirmOrderPage confirmOrderPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        cellPhonesPage = new CellPhonesPage();
        cartPage = new CartPage();
        registerPage = new RegisterPage();
        billingPage = new BillingPage();
        checkoutPage = new CheckoutPage();
        confirmOrderPage = new ConfirmOrderPage();
    }


    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        homePage.mouseHoverOnElectronicTab();
        homePage.clickOnCellPhones();
        Assert.assertEquals(cellPhonesPage.getCellPhoneText(), "Cell phones", "Cell phones is not displayed");
    }

    @Test(groups = {"smoke","regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnElectronicTab();
        homePage.clickOnCellPhones();
        Assert.assertEquals(cellPhonesPage.getCellPhoneText(), "Cell phones", "Cell phones is not displayed");
        cellPhonesPage.clickOnListViewTab();
        Thread.sleep(5000);
        cellPhonesPage.clickOnNokiaLumiaProduct();
        Assert.assertEquals(cellPhonesPage.verifyNokiaLumiaText(), "Nokia Lumia 1020", "Nokia Lumia 1020 is not displayed");
        Assert.assertEquals(cellPhonesPage.verifyPrice(), "$349.00", "$349.00 is not displayed");
        cellPhonesPage.changeTheQuantity();
        cellPhonesPage.clickOnAddToCartButton();
        String expectedText = "The product has been added to your shopping cart";
        Assert.assertEquals(cellPhonesPage.verifyProductAddedInShoppingCartText(), expectedText, "Product add in shopping cart is not displayed");
        cellPhonesPage.clickOnCloseButton();
        cellPhonesPage.hoverOnShoppingCartAndClickOnGoToCartButton();
        Assert.assertEquals(cartPage.verifyShoppingCartText(), "Shopping cart", "Shopping cart is not displayed");
        Thread.sleep(5000);
        Assert.assertEquals(cartPage.verifyTheQuantity(), "(2)", "2 is not displayed");
        Assert.assertEquals(cartPage.verifyTheTotal(), "$698.00", "$698.00 is not displayed");
        cartPage.clickOnCheckBox();
        cartPage.clickOnCheckoutButton();
        Assert.assertEquals(cartPage.verifyWelcomeMessage(), "Welcome, Please Sign In!", "Welcome message is not displayed");
        cartPage.clickOnRegisterTab();
        Assert.assertEquals(registerPage.verifyRegisterText(), "Register", "Register is not displayed");
        registerPage.mandatoryFields();
        registerPage.clickOnRegistrationButton();
        Assert.assertEquals(registerPage.verifyRegistrationText(), "Your registration completed", "Registration text is not displayed");
        registerPage.clickOnContinueTab();
        Assert.assertEquals(cartPage.checkShoppingCartText(), "Shopping cart", "Shopping cart is not displayed");
        Thread.sleep(5000);
        cartPage.clickCheckBox();
        cartPage.clickCheckOut();
        billingPage.fillDeliveryAddressFields();
        billingPage.clickOnContinueButton();
        checkoutPage.clickOn2ndDayAirButton();
        checkoutPage.clickContinue();
        checkoutPage.selectCreditCardRadioButton();
        checkoutPage.clickCon();
        checkoutPage.selectVisaFromDropDown();
        checkoutPage.fillCardDetails();
        checkoutPage.clickConBtn();
        Assert.assertEquals(confirmOrderPage.verifyCreditCardText(), "Credit Card", "Credit Card is not displayed");
        Assert.assertEquals(confirmOrderPage.verify2ndDayAirText(), "2nd Day Air", "2nd Day Air is not displayed");
        Assert.assertEquals(confirmOrderPage.verifyFinalTotal(), "$698.00", "$698.00 is not displayed");
        confirmOrderPage.clickOnConfirmButton();
        Assert.assertEquals(confirmOrderPage.verifyThankYouText(), "Thank you", "Thank you is not displayed");
        Assert.assertEquals(confirmOrderPage.verifySuccessfullyProcessedMessage(), "Your order has been successfully processed!", "Successfully processed message is not displayed");
        confirmOrderPage.clickOnContinue();
        Assert.assertEquals(homePage.getWelcomeToStoreText(), "Welcome to our store", "Welcome to our store is not displayed");
        homePage.clickOnLogoutLink();
    }
}
