package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utility.BaseTest;

public class BasePage extends BaseTest {
// Page Factory init döndürmek için açılan class ve wait tutucum
    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver), this);
    }
    protected ExpectedCondition<WebElement> waitForElement(MobileElement element){
        return ExpectedConditions.visibilityOf(element);
    }

}