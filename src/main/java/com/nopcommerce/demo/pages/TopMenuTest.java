package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class TopMenuTest extends Utility
{
    public void selectMenu(String menu) {
        List<WebElement> menuList = driver.findElements(By.xpath("//div[@class = 'header-menu']/ul/li"));
        try {
            for (WebElement options : menuList) {
                if (options.getText().equals(menu)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            menuList = driver.findElements(By.xpath("//div[@class = 'header-menu']/ul/li"));
        }
    }

    @CacheLookup
    @FindBy(xpath = "//a[@href='/computers']")
    By verifyComputer;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/electronics']")
    By verifyElectronics;
    @CacheLookup
    @FindBy(xpath = "//a[@href='/apparel']")
    By verifyApparel;

    public String getVerifyComputer() {
        Reporter.log("Verify Computer text" + verifyComputer.toString());
        return getTextFromElement(verifyComputer);
    }

    public String getVerifyElectronics() {
        Reporter.log("Verify electronics text" + verifyElectronics.toString());
        return getTextFromElement(verifyElectronics);
    }

    public String getVerifyApparel() {
        Reporter.log("Verify apparel text" + verifyApparel.toString());
        return getTextFromElement(verifyApparel);
    }
}
