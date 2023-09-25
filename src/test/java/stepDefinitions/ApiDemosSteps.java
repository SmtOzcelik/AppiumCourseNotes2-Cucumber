package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import screens.androidScreen.ApiDemosScreen;

public class ApiDemosSteps {
    ApiDemosScreen apiDemos=new ApiDemosScreen();

    @Given("App yuklensin")
    public void appYuklensin() {
        apiDemos.contineButon.click();
        apiDemos.okButon.click();
        apiDemos.uyariOkButon.click();
    }

    @And("kullanici ana ekranda")
    public void kullaniciAnaEkranda() {
        apiDemos.apiDemosLogo.isDisplayed();

    }

    @And("kullanici API Demos butununa tikladi")
    public void kullaniciAPIDemosButununaTikladi() {

    }

    @Then("kullanici API Demos ekraninda")
    public void kullaniciAPIDemosEkraninda() {
    }

    @And("kullanici Preference butununa tikladi")
    public void kullaniciPreferenceButununaTikladi() {
    }

    @Then("kullanici Preference ekraninda")
    public void kullaniciPreferenceEkraninda() {
    }

    @And("kullanici Preference dependencies tikladi")
    public void kullaniciPreferenceDependenciesTikladi() {
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
