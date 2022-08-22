package tests;

import dataContainer.ICustomerCreateVariables;
import dataContainer.ISuccessfullySignInVariables;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseTest;

@Feature("New Customer Save")
@Slf4j
public class CustomerSaveTestNG extends BaseTest {

    public CustomerSaveTestNG(){
        log.info("Test is starting");
    }

    @Test(priority = 1 , description = "Checks to Mobile App Name")
    @Description("User wants to check Mobile App Name")
    void validateToMobileAppName(){
        log.info("Checking : App Name");
        try{
            Assert.assertEquals(signInPage.getAppNameTextForSignInPage().getText(),"Appium Patika Tutorial");
        }catch (NoSuchElementException exception){
            exception.getMessage();
        }

    }

    @Test(priority = 2 , description = "Checks to Sign In Page title")
    @Description("User wants to check Sign In Page title , ie Appium Patika Tutorial")
    void validateSignInPageTitle(){
        log.info("Checking : Page Title");
        try{
            Assert.assertEquals(signInPage.getTitleForSignInPage().getText(),"Appium Patika Tutorial");
        }catch (NoSuchElementException exception){
            exception.getMessage();
        }
    }

    @Test(priority = 3 , description = "Checks to Sign In field text")
    @Description("User wants to check Sign In field text , ie Giriş Yap")
    void validateSignInText(){
        log.info("Checking : Sign In text");
        try{
            Assert.assertEquals(signInPage.getTitleForSignInField().getText() , "Giriş Yap");
        }catch (NoSuchElementException exception){
            exception.getMessage();
        }
    }

    @Test(priority = 4 , description = "Checks text for the Email Field")
    @Description("User wants to check Email field text , ie Email")
    void validateEmailField(){
        log.info("Checking : Email Field text");
        try{
            Assert.assertEquals(signInPage.getTitleForEmailField().getText() , "Email");
        }catch (NoSuchElementException exception){
            exception.getMessage();
        }
    }

    @Test(priority = 5 , description = "Send keys to Email field")
    @Description("User wants to write Email in the Email field")
    void validateSendKeysToEmailField(){
        log.info("Writing : Email to email field");
        try{
            Assert.assertTrue(signInPage.getEmailFieldForSignIn().isDisplayed());
            signInPage.sendKeysToUsernameField(ISuccessfullySignInVariables.EMAIL);
        }catch (NoSuchElementException exception){
            exception.getMessage();
        }
    }

    @Test(priority = 6)
    @Description("User wants to write Password in the Password field")
    void validateSendKeysToPasswordField(){
        log.info("Writing : Password to password field");
        try{
            Assert.assertTrue(signInPage.getPasswordFieldForSignIn().isDisplayed());
            signInPage.sendKeysToPasswordField(ISuccessfullySignInVariables.PASSWORD);
        }catch (NoSuchElementException exception){
            exception.getMessage();
        }
    }

    @Test(priority = 7)
    @Description("User wants to click to Sign In Button , and checks button name , ie GIRIŞ YAP")
    void validateClickToSignInButton(){
        log.info("Clicking : Sign in button");
        try{
            Assert.assertTrue(signInPage.getSignInButtonForSignInPage().isDisplayed());
            Assert.assertEquals(signInPage.getSignInButtonForSignInPage().getText() , "GIRIŞ YAP");
            signInPage.clickToSignInButton();
        }catch (NoSuchElementException exception){
            exception.getMessage();
        }
    }

    @Test(priority = 8)
    @Description("User navigates to Home Page after successfully Sign In and checks Hoş Geldiniz text")
    void validateCheckHomePageTextAfterSignIn() {
        log.info("Checking : Sign in title");
        try{
            homePage.waitForHomePageTitle();
            Assert.assertEquals(homePage.getSuccessfullySignInTitle().getText() , "Hoş Geldiniz");
        }catch (NoSuchElementException exception){
            exception.getMessage();
        }
    }

    @Test(priority = 9)
    @Description("User wants to click New Customer Button , and checks button name , ie YENI MÜŞTERI GIR")
    void validateClickToNewCustomerButton(){
        log.info("Clicking : New customer button");
        try{
            Assert.assertTrue(homePage.getCreateNewCustomerButton().isDisplayed());
            Assert.assertEquals(homePage.getCreateNewCustomerButton().getText() , "YENI MÜŞTERI GIR");
            homePage.clickToNewCustomerButton();
        }catch (NoSuchElementException exception){
            exception.getMessage();
        }
    }

    @Test(priority = 10)
    @Description("User wants to write new Customer's number in the Customer Number Field")
    void validateSendKeysToCustomerNumberField(){
        log.info("Writing : Phone number in the customer number field");
        try{
            Assert.assertTrue(createCustomerPage.getCustomerTelNumberField().isDisplayed());
            createCustomerPage.sendKeysToCustomerNumberField(ICustomerCreateVariables.CUSTOMER_PHONE);
        }catch (NoSuchElementException exception){
            exception.getMessage();
        }
    }

    @Test(priority = 11)
    @Description("User wants to write new Customer's name in the Customer Name Field")
    void validateSendKeysToCustomerNameField(){
        log.info("Writing : Full name in the customer name field");
        try{
            Assert.assertTrue(createCustomerPage.getCustomerFullNameField().isDisplayed());
            createCustomerPage.sendKeysToCustomerNameField(ICustomerCreateVariables.CUSTOMER_FULL_NAME);
        }catch (NoSuchElementException exception){
            exception.getMessage();
        }
    }

    @Test(priority = 12)
    @Description("User wants to write new Customer's note in the Customer Note Field")
    void validateSendKeysToCustomerNotesField(){
        log.info("Writing : Customer's note in the customer note field");
        try{
            Assert.assertTrue(createCustomerPage.getCustomerNotesField().isDisplayed());
            createCustomerPage.sendKeysToCustomerNotesField(ICustomerCreateVariables.PRODUCT_NUMBER);
        }catch (NoSuchElementException exception){
            exception.getMessage();
        }
    }

    @Test(priority = 13)
    @Description("User wants to write new Customer's address in the Customer Address Field")
    void validateSendKeysToCustomerAddressField(){
        log.info("Writing : Customer's address in the customer address field");
        try{
            Assert.assertTrue(createCustomerPage.getCustomerAddressField().isDisplayed());
            createCustomerPage.sendKeysToCustomerAddressField(ICustomerCreateVariables.CUSTOMER_ADDRESS);
        }catch (NoSuchElementException exception){
            exception.getMessage();
        }
    }

    @Test(priority = 14)
    @Description("User wants to click New Customer Save button , and check to button text , ie KAYDET")
    void validateClickCustomerSaveButton(){
        log.info("Clicking : Customer save button");
        try{
            Assert.assertTrue(createCustomerPage.getCustomerSaveButton().isDisplayed());
            Assert.assertEquals(createCustomerPage.getCustomerSaveButton().getText() , "KAYDET");
            createCustomerPage.clickCustomerSaveButton();
        }catch (NoSuchElementException exception){
            exception.getMessage();
        }
    }
}
