package com.crm.pages;

import com.crm.abstractPages.AbstractMain;
import org.junit.Assert;

public class HomePage extends AbstractMain {
    public String Title = "Sign in to your account";


    public void goToHomePage() throws InterruptedException {

        driver.get(BASE_URL);
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), Title);   // Check Title displayed
        utils.waitForSeconds();
        globalHooks.scenario.write("No Cookies message displayed ");
        utils.waitForSeconds();

    }

    public void verifyHeader(){
//        action.isElementPresent(Header);       //Check Header displayed


    }
    public void verifyFooter(){
//        action.isElementPresent(Footer);          // Check footer displayed
//        action.isElementPresent(LowerFooter);




    }


}
