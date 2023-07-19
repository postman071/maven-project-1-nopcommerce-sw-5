package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.basetest.BaseTest;
import com.nopcommerce.demo.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ComputerPageTest extends BaseTest
{
    HomePage homePage;
    ComputersPage computersPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputer buildYourOwnComputerPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    PaymentPage paymentPage;
    ConfirmOrderPage confirmOrderPage;
    SoftAssert softAssert;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        computersPage = new ComputersPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputer();
        cartPage = new CartPage();
        checkoutPage = new CheckoutPage();
        paymentPage = new PaymentPage();
        confirmOrderPage = new ConfirmOrderPage();
        softAssert = new SoftAssert();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyProductArrangeInAlphabeticalOrder() {
        homePage.clickOnComputerMenu();
        computersPage.clickOnDesktops();
        desktopsPage.selectSortZToA("Name: Z to A");
    }

    @Test(groups = {"smoke","regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickOnComputerMenu();
        computersPage.clickOnDesktops();
        desktopsPage.selectSortZToA("Name: A to Z");
        Thread.sleep(5000);
        desktopsPage.clickOnAddToCartButton();
        String expectedText = "Build your own computer";
        Assert.assertEquals(buildYourOwnComputerPage.getBuildYourOwnComputerText(), expectedText, "Build your own computer is not displayed");
        buildYourOwnComputerPage.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerPage.selectRam("8GB [+$60.00]");
        buildYourOwnComputerPage.selectHdd();
        buildYourOwnComputerPage.selectVistaPremiumOs();
        buildYourOwnComputerPage.clickOnTotalCommander();
        Thread.sleep(5000);
        String expectedPrice = "$1,475.00";
        Assert.assertEquals(buildYourOwnComputerPage.getPrice(), expectedPrice, "$1,475.00 is not displayed");
        buildYourOwnComputerPage.clickOnAddToCart();
        String expectedText1 = "The product has been added to your shopping cart";
        Assert.assertEquals(buildYourOwnComputerPage.getProductAddedText(), expectedText1, "The product has been added to your shopping cart is not displayed");
        buildYourOwnComputerPage.clickOnCloseButton();
        buildYourOwnComputerPage.mouseHoverOnShoppingCart();
        buildYourOwnComputerPage.clickOnGoToCartButton();
        String expectedText2 = "Shopping cart";
        Assert.assertEquals(cartPage.getShoppingCartText(), expectedText2, "Shopping cart is not displayed");
        cartPage.changeQuantity();
        cartPage.clickOnUpdateCart();
        String expectedTotal = "$2,950.00";
        Assert.assertEquals(cartPage.getTotal(), expectedTotal, "$2,950.00 is not displayed");
        cartPage.clickOnCheckBox();
        cartPage.clickOnCheckoutButton();
        Assert.assertEquals(cartPage.getWelcomeText(), "Welcome, Please Sign In!", "Welcome, Please Sign In! is not displayed");
        cartPage.clickOnCheckoutAsGuest();
        checkoutPage.fillMandatoryField();
        checkoutPage.clickOnNextDayAirButton();
        checkoutPage.setClickContinue();
        paymentPage.clickOnCreditCardRadioButton();
        paymentPage.setClickOnContinue();
        paymentPage.selectMasterCard();
        paymentPage.fillPaymentDetails();
        Assert.assertEquals(confirmOrderPage.getCreditCardText(), "Credit Card", "Credit Card payment method is not displayed");
        Assert.assertEquals(confirmOrderPage.getNextDayAirText(), "Next Day Air", "Next Day Air shipping method not displayed");
        confirmOrderPage.clickOnConfirmButton();
        Assert.assertEquals(confirmOrderPage.getThankYouText(), "Thank you", "Thank you text is not displayed");
        Assert.assertEquals(confirmOrderPage.getSuccessfullyMessage(), "Your order has been successfully processed!", "Successfully message is not displayed");
        confirmOrderPage.setContinueButtonClick();
        Assert.assertEquals(homePage.getWelcomeToStoreText(), "Welcome to our store", "Welcome to our store textis not displayed");
    }
}
