package utility;

import devices.DeviceFarm;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pages.CreateCustomerPage;
import pages.HomePage;
import pages.SignInPage;
import pages.SignUpPage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.InvalidPathException;
import static com.thoughtworks.selenium.Wait.DEFAULT_TIMEOUT;

@Slf4j
public class BaseTest {

    public static AppiumDriver<?> Driver;
    public static WebDriverWait wait;

    String oreo;
    DesiredCapabilities capabilities;
    public static HomePage homePage;
    public static SignInPage signInPage;
    public static SignUpPage signUpPage;
    public static CreateCustomerPage createCustomerPage;

    public BaseTest(){
        this.oreo = DeviceFarm.ANDROID_OREO.path;
    }


    @BeforeSuite
    public void configAppiumDriver() {

        this.capabilities = new DesiredCapabilities();

        try {
            this.capabilities = DeviceFarmUtility.pathToDesiredCapabilities(this.oreo);
        }catch (InvalidPathException exception){
            System.out.println("Please add correct path , this path is not working"+exception.getMessage());
        }

        try{
            File appDir = new File("src/test/resources/app");
            File app = new File(appDir,"patikaappium.apk");
            this.capabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
        }catch (WebDriverException exception){
            System.out.println("Please add apk , was not find file APK or APK path"+exception.getMessage());
        }

        // Remote url oluşturulmuştur appium testleri için , bilgisayarda tanımlanan default Appium konfigürasyonu için
        try {
            Driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),this.capabilities);
        }catch (MalformedURLException exception){
            System.out.println("Please set correct remote url hub :\t"+exception.getMessage());
        }
        wait = new WebDriverWait(Driver, DEFAULT_TIMEOUT);
        Driver.hideKeyboard();
    }

    // Teste başlamadan pagelerdeki objeler ve metotları kullanabilmem için sınıfları create etme işlemim
    @BeforeTest
    public void createPages(){
        homePage = new HomePage();
        signInPage = new SignInPage();
        signUpPage = new SignUpPage();
        createCustomerPage = new CreateCustomerPage();
    }

    @AfterMethod
    public void driverHide(){
        Driver.hideKeyboard();
    }

    @AfterSuite
    public void tearDown() {
      if (Driver != null)
        {
           Driver.quit();
        }
    }
}