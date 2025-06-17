package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.GirisSayfasiPages;
import utilities.ConfigReader;
import utilities.Driver;

public class GirisSayfasiStepdefs {

    GirisSayfasiPages girisSayfasi = new GirisSayfasiPages();

    @Given("Kullanıcı {string} giris sayfasına gider")
    public void kullanıcıGirisSayfasınaGider(String arg0) {

        Driver.getDriver().get(ConfigReader.getProperty("IKURL"));
    }

    @When("Kullanici email ve sifre girer")
    public void kullaniciEmailVeSifreGirer() {
        girisSayfasi.email.sendKeys(ConfigReader.getProperty("email"));
        girisSayfasi.sifre.sendKeys(ConfigReader.getProperty("sifre"));

    }

    @And("Kullanici giris yap butonuna tiklar")
    public void kullaniciGirisYapButonunaTiklar() {
        girisSayfasi.girisButton.click();

    }
}
