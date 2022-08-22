package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import lombok.Data;

// SignInPage'deki element ve metotlarımı yazdığım class
@Data
public class SignInPage extends BasePage{

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Appium Patika Tutorial']")
    private MobileElement appNameTextForSignInPage;

    @AndroidFindBy(id = "Title")
    private MobileElement titleForSignInPage;

    @AndroidFindBy(id = "signUpPageTitle")
    private MobileElement titleForSignInField;

    @AndroidFindBy(id = "signInEmailTitle")
    private MobileElement titleForEmailField;

    @AndroidFindBy(id = "signInEmailTextInput")
    private MobileElement emailFieldForSignIn;

    @AndroidFindBy(id = "SignInPasswordTitle")
    private MobileElement titleForPasswordField;

    @AndroidFindBy(id = "signInPasswordTextInput")
    private MobileElement passwordFieldForSignIn;

    @AndroidFindBy(id = "signInButton")
    private MobileElement signInButtonForSignInPage;

    @AndroidFindBy(id = "signInErrorView")
    private MobileElement errorViewForSignIn;

    @AndroidFindBy(id = "saveLoginCheckBox")
    private MobileElement rememberMeCheckBox;

    @AndroidFindBy(id = "signUpBtn")
    private MobileElement signUpButtonForSignInPage;

    @Step("Writes email to User Name Field in the Sign In Page.")
    public void sendKeysToUsernameField(String username){
        this.emailFieldForSignIn.sendKeys(username);
    }

    @Step("Writes password to Password Field in the Sign In Page.")
    public void sendKeysToPasswordField(String password){
        this.passwordFieldForSignIn.sendKeys(password);
    }

    @Step("Clicks to Sign In Button in the Sign In Page.")
    public void clickToSignInButton(){
        this.signInButtonForSignInPage.click();
    }

    @Step("Waits for error message for unsuccessful sing in in the Sign In Page.")
    public void waitForErrorViewText(){
        waitForElement(this.errorViewForSignIn);
    }

    @Step("Clicks to Sign Up Button in the Sign In Page.")
    public void clickToSignUpButton(){
        this.signUpButtonForSignInPage.click();
    }

}
