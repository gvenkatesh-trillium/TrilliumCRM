package com.crm.abstractPages;

import com.crm.utils.CommonUtils;
import com.crm.pages.*;
import com.crm.utils.CommonUtils;
import cucumber.api.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class AbstractMain {

    public static WebDriver driver;
    public static GlobalHooks globalHooks = new GlobalHooks();
    public static Actions action = new Actions();
    public static CommonUtils utils = new CommonUtils();
    public static HomePage homePage = new HomePage();
    public static Login loginPage = new Login();


    public static String BASE_URL = "https://trilliumx.crm11.dynamics.com/";
    public static By Header = By.cssSelector(".header");
    public static By Footer = By.cssSelector(".footer");
    public static By LowerFooter = By.className("__lower");
    public static Scenario scenario;


}
