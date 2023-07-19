package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//ul[1]/li/a[text()='Computers ']")
    WebElement computerMenu;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    By welcomeToStoreText;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Electronics ']")
    By hoverOnElectronic;

    @CacheLookup
    @FindBy(xpath = "//ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement clickOnCellPhone;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;


    public void clickOnComputerMenu() {
        Reporter.log("Click on computer menu" + computerMenu.toString());
        clickOnElement(computerMenu);
    }

    public String getWelcomeToStoreText() {
        Reporter.log("Get welcome to store text" + welcomeToStoreText.toString());
        return getTextFromElement(welcomeToStoreText);
    }

    public void mouseHoverOnElectronicTab() {
        Reporter.log("Hover on electronic" + hoverOnElectronic.toString());
        mouseHoverToElement(hoverOnElectronic);
    }

    public void clickOnCellPhones() {
        Reporter.log("Click on cell phones" + clickOnCellPhone.toString());
        clickOnElement(clickOnCellPhone);
    }

    public void clickOnLogoutLink() {
        Reporter.log("Click on logout link" + logoutLink.toString());
        clickOnElement(logoutLink);
    }
}
