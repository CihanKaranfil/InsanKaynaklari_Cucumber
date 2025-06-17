package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GirisSayfasiPages {
    public GirisSayfasiPages() {
        PageFactory.initElements(Driver.getDriver(), this); }

        @FindBy(xpath = "/html/body/div[1]/main/section/div/div[1]/div[1]/div/form/input") public WebElement email;
        @FindBy(xpath = "/html/body/div[1]/main/section/div/div[1]/div[1]/div/form/div[1]/input") public WebElement sifre;
        @FindBy(xpath = "/html/body/div[1]/main/section/div/div[1]/div[1]/div/form/button/span[1]") public WebElement girisButton;


}
