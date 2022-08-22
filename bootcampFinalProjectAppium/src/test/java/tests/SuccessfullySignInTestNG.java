package tests;

import dataContainer.ISuccessfullySignInVariables;
import io.qameta.allure.Description;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseTest;

@Slf4j
public class SuccessfullySignInTestNG extends BaseTest {

    @Test(priority = 1)
    @Description("User wants to check Mobile App Name")
    void validateToMobileAppName(){
        log.info("Checking : App Name");
        Assert.assertEquals(signInPage.getAppNameTextForSignInPage().getText(),"Appium Patika Tutorial");
    }

    @Test(priority = 2)
    @Description("User wants to check Sign In Page title , ie Appium Patika Tutorial")
    void validateSignInPageTitle(){
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
    @Description("User wants to check Email field text , ie Email")
    void validateEmailField(){
        log.info("Checking : Email Field text");
        Assert.assertEquals(signInPage.getTitleForEmailField().getText() , "Email");
    }

    @Test(priority = 5)
    @Description("User wants to write valid Email in the Email Field")
    void validateSendKeysToEmailField(){
        log.info("Writing : Valid email for successful login step");
        Assert.assertTrue(signInPage.getEmailFieldForSignIn().isDisplayed());
        signInPage.sendKeysToUsernameField(ISuccessfullySignInVariables.EMAIL);
    }

    @Test(priority = 6)
    @Description("User wants to write valid Password in the Password Field")
    void validateSendKeysToPasswordField(){
        log.info("Writing : Valid password for successful login step");
        Assert.assertTrue(signInPage.getPasswordFieldForSignIn().isDisplayed());
        signInPage.sendKeysToPasswordField(ISuccessfullySignInVariables.PASSWORD);
    }

    @Test(priority = 7)
    @Description("User wants to click to Sign In Button , and checks button name , ie GIRIŞ YAP")
    void validateClickToSignInButton(){
        log.info("Clicking : Sign in button");
        Assert.assertTrue(signInPage.getSignInButtonForSignInPage().isDisplayed());
        Assert.assertEquals(signInPage.getSignInButtonForSignInPage().getText() , "GIRIŞ YAP");
        signInPage.clickToSignInButton();
    }

    @Test(priority = 8)
    @Description("User checks Hoş Geldiniz text after Successfully sign in")
    void validateCheckHomePageTextAfterSignIn() {
        log.info("Checking : Successfully sign in text");
        homePage.waitForHomePageTitle();
        Assert.assertEquals(homePage.getSuccessfullySignInTitle().getText() , "Hoş Geldiniz");
    }
}
