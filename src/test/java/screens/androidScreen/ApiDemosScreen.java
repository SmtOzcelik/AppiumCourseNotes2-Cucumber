package screens.androidScreen;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class ApiDemosScreen {
    public ApiDemosScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='API Demos']")
    public WebElement apiDemosButon;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='API Demos']")
    public WebElement apiDemosText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public WebElement preferenceButon;




}
