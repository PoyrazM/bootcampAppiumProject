package tests;

import dataContainer.ISignUpVariables;
import io.qameta.allure.Description;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseTest;

@Slf4j
public class SignUpTestNG extends BaseTest {

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
    @Description("User wants to click Sign Up button in the Sign In Page")
    void validateClickSignUpButton(){
        log.info("Clicking : Sign up button");
        Assert.assertTrue(signInPage.getSignUpButtonForSignInPage().isDisplayed());
        signInPage.clickToSignUpButton();
    }

    @Test(priority = 4)
    @Description("User checks Sign Up Page title in the Sign Up Page")
    void validateSignUpPageTitle(){
        log.info("Checking : Sign up page title");
        Assert.assertEquals(signUpPage.getAppNameTextForSignUpPage().getText(),"Appium Patika Tutorial");
    }

    @Test(priority = 5)
    @Description("User wants to write email in the email field for sign up step")
    void validateSendKeysToUsernameField(){
        log.info("Writing : Email for register step");
        Assert.assertTrue(signUpPage.getUsernameField().isDisplayed());
        Assert.assertEquals(signUpPage.getUsernameField().getText() , "Username");
        signUpPage.sendKeysToUsernameField(ISignUpVariables.EMAIL);
        Assert.assertFalse(signUpPage.getUsernameField().getText().isEmpty());
    }

    @Test(priority = 6)
    @Description("User wants to write password in the email field for sign up step")
    void validateSendKeysToPasswordField(){
        log.info("Writing : Password for register step");
        Assert.assertTrue(signUpPage.getPasswordField().isDisplayed());
        Assert.assertEquals(signUpPage.getPasswordField().getText() , "Password");
        signUpPage.sendKeysToPasswordField(ISignUpVariables.PASSWORD);
        Assert.assertFalse(signUpPage.getPasswordField().getText().isEmpty());
    }

    @Test(priority = 7)
    @Description("User wants to click Sign Up Button in the Sign Up Page")
    void validateClickToSignUpButton(){
        log.info("Clicking : Sign up button");
        Assert.assertTrue(signUpPage.getSignUpButton().isDisplayed());
        Assert.assertEquals(signUpPage.getSignUpButton().getText(),"SIGN UP");
        signUpPage.clickSignUpButton();
    }
}
