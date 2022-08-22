package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import lombok.Data;

// SignUpPage'deki element ve metotlarımı yazdığım class
@Data
public class SignUpPage extends BasePage{

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Appium Patika Tutorial']")
    private MobileElement appNameTextForSignUpPage;

    @AndroidFindBy(id = "username")
    private MobileElement usernameField;

    @AndroidFindBy(id = "password1")
    private MobileElement passwordField;

    @AndroidFindBy(id = "sign")
    private MobileElement signUpButton;

    @Step("Writes email in the User Name field.")
    public void sendKeysToUsernameField(String username){
        this.usernameField.sendKeys(username);
    }

    @Step("Writes password in the Password field.")
    public void sendKeysToPasswordField(String password){
        this.passwordField.sendKeys(password);
    }

    @Step("Clicks to Sign Up Button in the Sign Up Page")
    public void clickSignUpButton(){
        this.signUpButton.click();
    }

}
