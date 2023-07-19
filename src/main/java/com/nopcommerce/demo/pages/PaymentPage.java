package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PaymentPage extends Utility
{
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardRadioButton;
    @CacheLookup
    @FindBy(xpath = "//li[4]/div[2]/div[1]/button[1]")
    WebElement clickOnContinue;

    @CacheLookup
    @FindBy(id = "CreditCardType")
    By masterCard;
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    By expireMonth;
    @CacheLookup
    @FindBy(id = "ExpireYear")
    By expireYear;
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//li[5]/div[2]/div[1]/button[1]")
    WebElement clickContinueButton;

    public void clickOnCreditCardRadioButton() {
        Reporter.log("CLick on credit card radio button" + creditCardRadioButton.toString());
        clickOnElement(creditCardRadioButton);
    }

    public void setClickOnContinue() {
        Reporter.log("Click on continue" + clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }

    public void selectMasterCard() {
        Reporter.log("Select master card" + masterCard.toString());
        selectByVisibleTextFromDropDown(masterCard, "Master card");
    }

    public void fillPaymentDetails() {
        Reporter.log("Enter card holder name" + cardHolderName.toString());
        Reporter.log("Enter card number" + cardNumber.toString());
        Reporter.log("Select expire month" + expireMonth.toString());
        Reporter.log("Select expire year" + expireYear.toString());
        Reporter.log("Enter card code" + cardCode.toString());
        Reporter.log("Click on continue button" + clickContinueButton.toString());


        sendTextToElement(cardHolderName, "John david");
        sendTextToElement(cardNumber, "11717444477999");
        selectByVisibleTextFromDropDown(expireMonth, "07");
        selectByVisibleTextFromDropDown(expireYear, "2027");
        sendTextToElement(cardCode, "717");
        clickOnElement(clickContinueButton);
    }
}
