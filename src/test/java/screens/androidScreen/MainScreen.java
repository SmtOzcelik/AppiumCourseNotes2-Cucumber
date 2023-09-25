package screens.androidScreen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class MainScreen {
    public MainScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(id = "com.android.permissioncontroller:id/continue_button")
    public WebElement contineButon;
    @AndroidFindBy(id = "android:id/button1")
    public WebElement okButon;
    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/buttonDefaultPositive")
    public WebElement uyariOkButon;
    @AndroidFindBy(xpath = "(//android.widget.ImageView)[1]")
    public WebElement apiDemosLogo;

}
