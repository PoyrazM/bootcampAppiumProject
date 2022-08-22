package tests;

import dataContainer.INonCorrectSignInVariables;
import io.qameta.allure.Description;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseTest;

@Slf4j
public class NonCorrectUsernameSignInTestNG extends BaseTest {

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
    @Description("User wants to write non register email in the Email Field")
    void validateSendKeysToEmailField(){
        log.info("Writing : Email to email field");
        Assert.assertTrue(signInPage.getEmailFieldForSignIn().isDisplayed());
        signInPage.sendKeysToUsernameField(INonCorrectSignInVariables.NON_REGISTER_EMAIL);
    }

    @Test(priority = 6)
    @Description("User wants to write non register password in the Password Field")
    void validateSendKeysToPasswordField(){
        log.info("Writing : Password to password field");
        Assert.assertTrue(signInPage.getPasswordFieldForSignIn().isDisplayed());
        signInPage.sendKeysToPasswordField(INonCorrectSignInVariables.PASSWORD);
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
    @Description("User checks to Sign In Errow with Non Register Account datas")
    void validateToErrorMessageForUnsuccessfulSignIn(){
        log.info("Checking : Authentication Error Message");
        signInPage.waitForErrorViewText();
        Assert.assertEquals(signInPage.getErrorViewForSignIn().getText() ,
"There is no user record corresponding to this identifier. The user may have been deleted.");
    }
}
