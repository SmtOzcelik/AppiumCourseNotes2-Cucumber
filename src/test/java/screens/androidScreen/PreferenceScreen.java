package screens.androidScreen;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class PreferenceScreen {
    public PreferenceScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }



    @AndroidFindBy(xpath = "//android.widget.TextView[@text='9. Switch']")
    public WebElement switchButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public WebElement preferenceText;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']")
    public WebElement preferenceDependenciesbuton;
}
