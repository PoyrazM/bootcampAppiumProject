package tests;

import dataContainer.INonCorrectSignInVariables;
import io.qameta.allure.Description;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseTest;

@Slf4j
public class EmptyEmailSignInTestNG extends BaseTest {

    @Test(priority = 1)
    @Description("User wants to check Mobile App Name")
    void validateToMobileAppName(){
        log.info("Checking : App Name");
        Assert.assertEquals(signInPage.getAppNameTextForSignInPage().getText(),"Appium Patika Tutorial");
    }

    @Test(priority = 2)
    @Description("User wants to check Sign In Page title , ie Appium Patika Tutorial")
    void validateSignInPageTitle() {
        log.info("Checking : Page Title");
        Assert.assertEquals(signInPage.getTitleForSignInPage().getText(),"Appium Patika Tutorial");
    }

    @Test(priority = 3)
    @Description("User wants to check Sign In field text , ie Giriş Yap")
    void validateSignInText(){
        log.info("Checking : Sign In text");
        Assert.assertEquals(signInPage.getTitleForSignInField().getText() , "Giriş Yap");
    }

    @Test(priority = 4)
    @Description("User wants to check Email field text , ie Email ," +
            "User wants to write nothing in the Email field , ie Email Field hold the empty")
    void validateEmailField(){
        log.info("Checking : Email field text and writing nothing");
        Assert.assertEquals(signInPage.getTitleForEmailField().getText() , "Email");
    }

    @Test(priority = 5)
    @Description("User wants to write Password in the Password field")
    void validateSendKeysToPasswordField(){
        log.info("Writing : Password to password field");
        Assert.assertTrue(signInPage.getPasswordFieldForSignIn().isDisplayed());
        signInPage.sendKeysToPasswordField(INonCorrectSignInVariables.PASSWORD);
    }

    @Test(priority = 6)
    @Description("User wants to click to Sign In Button , and checks button name , ie GIRIŞ YAP")
    void validateClickToSignInButton(){
        log.info("Clicking : Sign in button");
        Assert.assertTrue(signInPage.getSignInButtonForSignInPage().isDisplayed());
        Assert.assertEquals(signInPage.getSignInButtonForSignInPage().getText() , "GIRIŞ YAP");
        signInPage.clickToSignInButton();
    }

    @Test(priority = 7)
    @Description("User checks empty email error text")
    void validateCheckToErrorMessage(){
        log.info("Checking : Error message");
        Assert.assertEquals(signInPage.getErrorViewForSignIn().getText() , "Email boş olamaz");
    }
}
