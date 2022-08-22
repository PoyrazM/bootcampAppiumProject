package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import lombok.Data;

// CreateCustomerPage'deki element ve metotlarımı yazdığım class
@Data
public class CreateCustomerPage extends BasePage{

    @AndroidFindBy(id = "customertelnumber")
    private MobileElement customerTelNumberField;

    @AndroidFindBy(id = "customernamesurname")
    private MobileElement customerFullNameField;

    @AndroidFindBy(id = "customerworktracknumber")
    private MobileElement customerWorkTrackNumberField;

    @AndroidFindBy(id = "customernotes")
    private MobileElement customerNotesField;

    @AndroidFindBy(id = "customeraddress")
    private MobileElement customerAddressField;

    @AndroidFindBy(id = "in_date")
    private MobileElement inDateField;

    @AndroidFindBy(id = "btn_date")
    private MobileElement inDateButton;

    @AndroidFindBy(id = "in_received_date")
    private MobileElement inReceivedDateField;

    @AndroidFindBy(id = "btn_received_date")
    private MobileElement inReceivedButton;

    @AndroidFindBy(id = "customerInfoSave")
    private MobileElement customerSaveButton;

    @Step("Writing phone number in the Customer Phone Number field.")
    public void sendKeysToCustomerNumberField(String phoneNumber){
        this.customerTelNumberField.sendKeys(phoneNumber);
    }

    @Step("Writing name and surname in the Customer Full Name field.")
    public void sendKeysToCustomerNameField(String fullName){
        this.customerFullNameField.sendKeys(fullName);
    }

    @Step("Writing customer notes ,ie how many carpet given the Company from Customer.")
    public void sendKeysToCustomerNotesField(String productNumber){
        this.customerNotesField.sendKeys(productNumber);
    }

    @Step("Writing customer's address in the Customer Address field.")
    public void sendKeysToCustomerAddressField(String address){
        this.customerAddressField.sendKeys(address);
    }

    @Step("Clicks to new customer save button.")
    public void clickCustomerSaveButton(){
        this.customerSaveButton.click();
    }
}
