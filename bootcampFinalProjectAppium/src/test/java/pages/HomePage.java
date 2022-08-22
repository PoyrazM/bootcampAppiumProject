package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import lombok.Data;

// HomePage'deki element ve metotlarımı yazdığım class
@Data
public class HomePage extends BasePage{

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Appium Patika Tutorial']")
    private MobileElement appNameTextForHomePage;

    @AndroidFindBy(id = "Title")
    private MobileElement titleForHomePage;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Hoş Geldiniz']")
    private MobileElement successfullySignInTitle;

    @AndroidFindBy(id = "searchCustomerInfo")
    private MobileElement customerSearchButton;

    @AndroidFindBy(id = "newCustomerInfo")
    private MobileElement createNewCustomerButton;

    @AndroidFindBy(id = "oldCustomerInfo")
    private MobileElement updateCustomerButton;


    public void waitForHomePageTitle(){
        waitForElement(this.successfullySignInTitle);
    }

    @Step("Clicks to create new customer button in the Home Page")
    public void clickToNewCustomerButton(){
        this.createNewCustomerButton.click();
    }
}
