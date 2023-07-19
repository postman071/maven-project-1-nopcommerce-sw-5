package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.basetest.BaseTest;
import com.nopcommerce.demo.pages.TopMenuTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopMenuPageTest extends BaseTest
{
   TopMenuTest topMenuPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        topMenuPage = new TopMenuTest();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToComputer() {
        topMenuPage.selectMenu("Computers");
        Assert.assertEquals(topMenuPage.getVerifyComputer(), "Computers", "Computer message is not displayed");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToElectronics() {
        topMenuPage.selectMenu("Electronics");
        Assert.assertEquals(topMenuPage.getVerifyElectronics(), "Electronics", "Electronics message is not displayed");
    }

    @Test(groups = {"regression"})
    public void verifyUserShouldNavigateToApparel() {
        topMenuPage.selectMenu("Apparel");
        Assert.assertEquals(topMenuPage.getVerifyApparel(), "Apparel", "Apparel message is not displayed");
    }
}
