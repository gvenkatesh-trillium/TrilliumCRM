package com.crm.stepDefinations;

import com.crm.abstractPages.AbstractMain;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDef extends AbstractMain {


    @Given("^I am on CRM homepage$")
    public void i_am_on_CRM_homepage() throws Throwable {
       homePage.goToHomePage();

    }

    @And("^I login with valid details username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_login_with_valid_details_username_as_and_password_as(String username, String password) throws Throwable {
       loginPage.enterValidLoginDetailsAndLogin(username,password);
    }

    @Then("^I should see Membership Dashboard$")
    public void i_should_see_Membership_Dashboard() throws Throwable {
        loginPage.verifyCRMLogin();


    }

}
