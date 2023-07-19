package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputersPage extends Utility
{

    @CacheLookup
    @FindBy(xpath = "//img[@alt='Picture for category Desktops']")
    WebElement desktops;
    public void clickOnDesktops()
    {
        Reporter.log("Click on desktops" + desktops.toString());
        clickOnElement(desktops);
    }
}
