package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import screens.androidScreen.ApiDemosScreen;
import screens.androidScreen.MainScreen;
import screens.androidScreen.PreferenceScreen;

public class ApiDemosSteps {
    ApiDemosScreen apiDemosScreen=new ApiDemosScreen();
    MainScreen mainScreen=new MainScreen();
    PreferenceScreen preferenceScreen=new PreferenceScreen();
    @Given("App yuklensin")
    public void appYuklensin() {
        mainScreen.contineButon.click();
        mainScreen.okButon.click();
        mainScreen.uyariOkButon.click();
    }

    @And("kullanici ana ekranda")
    public void kullaniciAnaEkranda() {
        Assert.assertTrue(mainScreen.apiDemosLogo.isDisplayed());

    }

    @And("kullanici API Demos butununa tikladi")
    public void kullaniciAPIDemosButununaTikladi() {
           apiDemosScreen.apiDemosButon.click();
    }

    @Then("kullanici API Demos ekraninda")
    public void kullaniciAPIDemosEkraninda() {
        Assert.assertTrue(apiDemosScreen.apiDemosText.isDisplayed());
    }

    @And("kullanici Preference butununa tikladi")
    public void kullaniciPreferenceButununaTikladi() {
        apiDemosScreen.preferenceButon.click();
    }

    @Then("kullanici Preference ekraninda")
    public void kullaniciPreferenceEkraninda() {
        Assert.assertTrue(preferenceScreen.preferenceText.isDisplayed());

    }

    @And("kullanici Preference dependencies tikladi")
    public void kullaniciPreferenceDependenciesTikladi() {
        preferenceScreen.preferenceDependenciesbuton.click();
    }

    @And("kullanici WiFi check box secmis olacak")
    public void kullaniciWiFiCheckBoxSecmisOlacak() {
    }

    @And("kullanici WiFi Settings tikladi")
    public void kullaniciWiFiSettingsTikladi() {
    }

    @Then("WiFi setting popup geldi")
    public void wifiSettingPopupGeldi() {
    }

    @And("kullanici {string} yazdi")
    public void kullaniciYazdi(String arg0) {
    }

    @And("kullanci ok butonuna tikladi")
    public void kullanciOkButonunaTikladi() {
    }
}
