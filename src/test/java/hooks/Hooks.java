package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    //@Before ve @After metodlarını içeriri

    @Before
    public void  setUpDcenarios(){
        System.out.println("Before method");
    }
    @After
    public  void tearDownScenarios(Scenario scenario){
        //Eger bir scenerio FAİL ederse, ekran görüntüsü al ve rapora ekle
        if(scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(failedScreenshot, "image/png", "faild_scenario" + scenario.getName());
            Driver.closeDriver();
        }
    }
}
