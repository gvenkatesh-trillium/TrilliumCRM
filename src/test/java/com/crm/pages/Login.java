package com.crm.pages;

import com.crm.abstractPages.AbstractMain;
import org.junit.Assert;
import org.openqa.selenium.By;


public class Login extends AbstractMain {
    public static By UsernameBox = By.cssSelector("input[name='loginfmt']");
    public static By PasswordBox = By.cssSelector("input[name='passwd']");
    public static By NextButton = By.cssSelector("#idSIButton9");
    public static By SignInButton = By.cssSelector("#idSIButton9");
    public static By StayInInButton = By.cssSelector("#idSIButton9");
    public static By LoginPage = By.cssSelector("body");


    public void goToLoginPage() throws InterruptedException {
        driver.get(BASE_URL);
        utils.waitForSeconds();

    }

    public void enterValidLoginDetailsAndLogin(String username, String password) throws InterruptedException {

        action.sendElement(UsernameBox, username);
        action.clickElement(NextButton);
        Thread.sleep(2000);
        action.sendElement(PasswordBox, password);
        Thread.sleep(2000);
        action.clickElement(SignInButton);
        Thread.sleep(2000);
        utils.waitForSeconds();
        if(action.getElementText(By.cssSelector(".inner.fade-in-lightbox")).contains("Do this to reduce the number of times you are asked to sign in.")){
            action.clickElement(StayInInButton);
            Thread.sleep(2000);
            utils.waitForSeconds();
        }

    }

    public void verifyCRMLogin() throws InterruptedException {
        Assert.assertTrue(action.getElementText(LoginPage).contains("Microsoft Dynamics 365"));
        Assert.assertTrue(action.getElementText(LoginPage).contains("Membership"));
        Thread.sleep(2000);
        action.clickElement(By.cssSelector(".navTabButtonArrowDown.navTabButtonImageSandbox"));
        Thread.sleep(2000);
        action.clickElement(By.cssSelector("#nav_conts"));
        Thread.sleep(2000);
//        action.clickElement(By.cssSelector("a[title='Next Renewal Reis']"));
        action.clickElements(By.cssSelector(".ms-crm-List-DataCell.inner-grid-cellPadding"),1);
        Thread.sleep(2000);
        action.clickElement(By.cssSelector(".ms-crm-moreCommand-image"));
        Thread.sleep(2000);


    }



}
