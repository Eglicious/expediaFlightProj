package expediaTest;

import expediaPF.BeginExpediaFlightBooking;
import expediaPF.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RunExpediaFlightBooking {

    WebDriver driver;
    @Parameters({"browser", "url", "origin","destination"})
    @Test
    void create(String browsers, String urls, String orig, String dest) {
        driver = BrowserFactory.openbrowser(browsers, urls);
        BeginExpediaFlightBooking execute = PageFactory.initElements(driver, BeginExpediaFlightBooking.class);
        execute.flightBokking(orig,dest);
        execute.personalInfo("","","","","",07,"","");
        execute.cardInfo("","",04,"","");
        execute.billingAddressInfo("","","","","","","","");


    }

    @AfterSuite
    void terminate(){
        driver.quit();

    }
}
