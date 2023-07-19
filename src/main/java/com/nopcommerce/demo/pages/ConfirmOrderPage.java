package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ConfirmOrderPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    By creditCardText;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]")
    By nextDayAirText;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirm;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    By thankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    By successfullyMessage;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButtonClick;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    By checkCreditCardText;
    @CacheLookup
    @FindBy(xpath = "//div[2]/div[2]/ul[1]/li[1]/span[2]")
    By check2ndDayAirText;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    By checkLastTotal;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    By checkThankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    By successMessage;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickOnContinue;


    public String getCreditCardText() {
        Reporter.log("Get credit card text" + creditCardText.toString());
        return getTextFromElement(creditCardText);
    }

    public String getNextDayAirText() {
        Reporter.log("Get next day air text" + nextDayAirText.toString());
        return getTextFromElement(nextDayAirText);
    }

    public void clickOnConfirmButton() {
        Reporter.log("Click on confirm button" + confirm.toString());
        clickOnElement(confirm);
    }

    public String getThankYouText() {
        Reporter.log("Get thank you text" + thankYouText.toString());
        return getTextFromElement(thankYouText);
    }

    public String getSuccessfullyMessage() {
        Reporter.log("Get success message" + successfullyMessage.toString());
        return getTextFromElement(successfullyMessage);
    }

    public void setContinueButtonClick() {
        Reporter.log("Click on continue button" + continueButtonClick.toString());
        clickOnElement(continueButtonClick);
    }

    public String verifyCreditCardText() {
        Reporter.log("Verify Credit card text" + checkCreditCardText.toString());
        return getTextFromElement(checkCreditCardText);
    }

    public String verify2ndDayAirText() {
        Reporter.log("Verify 2nd day air text" + check2ndDayAirText.toString());
        return getTextFromElement(check2ndDayAirText);
    }

    public String verifyFinalTotal() {
        Reporter.log("Verify final total" + checkLastTotal.toString());
        return getTextFromElement(checkLastTotal);
    }

    public void clickOnConfirmBtn() {
        Reporter.log("Click on confirm button" + confirmButton.toString());
        clickOnElement(confirmButton);
    }

    public String verifyThankYouText() {
        Reporter.log("Verify thank you text" + checkThankYouText.toString());
        return getTextFromElement(checkThankYouText);
    }

    public String verifySuccessfullyProcessedMessage() {
        Reporter.log("Verify success message" + successMessage.toString());
        return getTextFromElement(successMessage);
    }

    public void clickOnContinue() {
        Reporter.log("Click on continue" + clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }
}
