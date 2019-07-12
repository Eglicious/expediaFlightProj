package expediaPF;

import com.google.errorprone.annotations.Var;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class BeginExpediaFlightBooking {

    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tab-flight-tab-hp\"]")
    WebElement flightMenu;

    @FindBy(how = How.XPATH, using = "//*[@id=\"flight-origin-hp-flight\"]")
    WebElement originInputLable;


    @FindBy(how = How.XPATH, using = "//*[@id=\"typeaheadDataPlain\"]/div/li[4]")
    WebElement originSelect;
    // this is changed according to the parameter you entered in the Input lable



    @FindBy(how = How.XPATH, using = "//*[@id=\"flight-destination-hp-flight\"]")
    WebElement destinationInputLable;


    @FindBy(how = How.XPATH, using = "//*[@id=\"typeaheadDataPlain\"]/div/li[1]")
    WebElement destinationSelect;
    // this is changed according to the parameter you entered in the Input lable


    @FindBy(how = How.XPATH, using = "//*[@id=\"flight-departing-hp-flight\"]")
    WebElement departurDate;

    @FindBy(how = How.XPATH, using = "//*[@id=\"flight-returning-hp-flight\"]")
    WebElement returningDate;

    @FindBy(how = How.XPATH, using = "//*[@id=\"flight-departing-wrapper-hp-flight\"]/div/div/div[2]/table/tbody/tr[4]/td[3]/button")
    WebElement selectDeptDate;

    @FindBy(how = How.XPATH, using = "//*[@id=\"flight-returning-wrapper-hp-flight\"]/div/div/div[3]/table/tbody/tr[2]/td[3]/button")
    WebElement selectRetDate;

    @FindBy(how = How.XPATH, using = "//*[@id=\"gcw-flights-form-hp-flight\"]/div[7]/label/button[@class=\"btn-primary btn-action gcw-submit\"][@type=\"submit\"]")
    WebElement searchButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"flight-module-2019-07-23t22:20:00-04:00-coach-iad-fra-ua-932-coach-fra-add-ua-7214_2019-08-06t23:40:00+03:00-coach-add-fra-lh-9695-coach-fra-iad-lh-9252_\"]/div[1]/div[1]/div[2]/div/div[2]/button")
    WebElement searchDepartureFlightButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"flight-module-2019-07-23t22:20:00-04:00-coach-iad-fra-ua-932-coach-fra-add-ua-7214_2019-08-06t23:40:00+03:00-coach-add-fra-lh-9695-coach-fra-iad-lh-9290_\"]/div[1]/div[1]/div[2]/div/div[2]/button")
    WebElement searchArrivaleFlightButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"forcedChoiceNoThanks\"]")
    WebElement noThanksLink;

      @FindBy(how = How.XPATH, using = "//*[@id=\"bookButton\"]")
      WebElement continueBookingButton;

      @FindBy(how = How.XPATH, using = "//*[@id=\"firstname[0]\"]")
      WebElement firstNameInputLable;

      @FindBy(how = How.XPATH, using = "//*[@id=\"middlename[0]\"]")
      WebElement middelNameInputLable;

      @FindBy(how = How.XPATH, using = "//*[@id=\"lastname[0]\"]")
      WebElement lastNameInputLable;

      @FindBy(how = How.XPATH, using = "//*[@id=\"phone-number[0]\"]")
      WebElement phoneInputLable;

      @FindBy(how = How.XPATH, using = "//*[@id=\"gender_female[0]\"]")
      WebElement femaleRadioButton;

      @FindBy(how = How.XPATH, using = "//*[@id=\"gender_male[0]\"]")
      WebElement maleRadioButton;

      @FindBy(how = How.XPATH, using = "//*[@id=\"date_of_birth_month0\"]")
      WebElement monthDobSelect;

      @FindBy(how = How.XPATH, using = "//*[@id=\"date_of_birth_day[0]\"]")
      WebElement dayDobSelect;

      @FindBy(how = How.XPATH, using = "//*[@id=\"date_of_birth_year[0]\"]")
      WebElement yearDobSelect;

      @FindBy(how = How.XPATH, using = "//*[@id=\"insuranceOffering0\"]/div[4]")
      WebElement flightProtectionYesRadioButton;

      @FindBy(how = How.XPATH, using = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/label[1]/input")
      WebElement cardholderNameInputLable;

      @FindBy(how = How.XPATH, using = "//*[@id=\"creditCardInput\"]")
      WebElement cardNumberInputLable;

      @FindBy(how = How.XPATH, using = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/fieldset/label[1]/select")
      WebElement cardMonthSelect;

      @FindBy(how = How.XPATH, using = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/fieldset/label[2]/select")
      WebElement cardYearSelect;

      @FindBy(how = How.XPATH, using = "//*[@id=\"new_cc_security_code\"]")
      WebElement cardSecurityInputLable;

      @FindBy(how = How.XPATH, using = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[1]/input")
      WebElement billingAddressInputLable;

      @FindBy(how = How.XPATH, using = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[2]/input")
      WebElement billingSuitInputLable;

      @FindBy(how = How.XPATH, using = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[3]/input")
      WebElement cityInputLable;

      @FindBy(how = How.XPATH, using = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[4]/select")
      WebElement stateSelect;

      @FindBy(how = How.XPATH, using = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[5]/input")
      WebElement zipcodeInputLable;

      @FindBy(how = How.XPATH, using = "//*[@id=\"email\"]/div[1]/fieldset/label/input")
      WebElement emailInputLable;

      @FindBy(how = How.XPATH, using = "//*[@id=\"account-creation\"]/fieldset/label[1]/input")
      WebElement passwordInputLable;

      @FindBy(how = How.XPATH, using = "//*[@id=\"account-creation\"]/fieldset/label[2]/input")
      WebElement confirmpassInputLable;

      @FindBy(how = How.XPATH, using = "//*[@id=\"complete-booking\"]")
      WebElement completBookingButton;

    public BeginExpediaFlightBooking(WebDriver driver){
        this.driver=driver;
    }

    public void flightBokking(String ori, String dest) {

        flightMenu.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        originInputLable.sendKeys(ori);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        originSelect.click();

        destinationInputLable.sendKeys(dest);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        destinationSelect.click();

        departurDate.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        selectDeptDate.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        returningDate.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        selectRetDate.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchButton.click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebDriverWait wait = new WebDriverWait(driver, (30));
        wait.until(ExpectedConditions.elementToBeClickable(searchDepartureFlightButton));
        searchDepartureFlightButton.click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchArrivaleFlightButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        noThanksLink.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriver wd = this.driver;
        String Tab1 = wd.getWindowHandle();
        ArrayList<String> availableWindows = new ArrayList<String>(wd.getWindowHandles());
        if (!availableWindows.isEmpty()) {
            wd.switchTo().window(availableWindows.get(1));
        }

        JavascriptExecutor scroll2 = (JavascriptExecutor) driver;
        scroll2.executeScript("arguments[0].scrollIntoView(true);", continueBookingButton);
        continueBookingButton.click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void personalInfo(String fname, String mname, String lname, String phoneno, String gender, int month, String day, String year ) {
        firstNameInputLable.sendKeys(fname);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        middelNameInputLable.sendKeys(mname);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lastNameInputLable.sendKeys(lname);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        phoneInputLable.sendKeys(phoneno);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (gender.equalsIgnoreCase("female")) {
            femaleRadioButton.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (gender.equalsIgnoreCase("male")) {
            maleRadioButton.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Unknown Gender Entered");
        }

        JavascriptExecutor temp = (JavascriptExecutor) driver;
        temp.executeScript("arguments[0].scrollIntoView(true);", monthDobSelect);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        monthDobSelect.click();
        Select mnt = new Select(monthDobSelect);
        mnt.selectByIndex(month);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dayDobSelect.click();
        Select da = new Select(dayDobSelect);
        da.selectByValue(day);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        yearDobSelect.click();
        Select yr = new Select(yearDobSelect);
        yr.selectByVisibleText(year);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        flightProtectionYesRadioButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JavascriptExecutor temp1 = (JavascriptExecutor) driver;
        temp1.executeScript("arguments[0].scrollIntoView(true);", flightProtectionYesRadioButton);
    }
    public void cardInfo( String cardName, String cardNumber, int crmonth, String cryear, String cvvNumber) {
        cardholderNameInputLable.sendKeys(cardName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cardNumberInputLable.sendKeys(cardNumber);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor temp2 = (JavascriptExecutor) driver;
        temp2.executeScript("arguments[0].scrollIntoView(true);", cardNumberInputLable);

        cardMonthSelect.click();
        Select crdmn = new Select(cardMonthSelect);
        crdmn.selectByIndex(crmonth);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cardYearSelect.click();
        Select cryr = new Select(cardYearSelect);
        cryr.selectByVisibleText(cryear);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cardSecurityInputLable.sendKeys(cvvNumber);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        JavascriptExecutor temp3 = (JavascriptExecutor) driver;
        temp3.executeScript("arguments[0].scrollIntoView(true);", cardSecurityInputLable);
    }

    public void billingAddressInfo(String address1, String address2, String city, String state, String zipcode, String email, String pass, String confpass ){

        billingAddressInputLable.sendKeys(address1);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        billingSuitInputLable.sendKeys(address2);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cityInputLable.sendKeys(city);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stateSelect.click();
        Select stat = new Select(stateSelect);
        stat.selectByVisibleText(state);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JavascriptExecutor temp4 = (JavascriptExecutor)driver;
        temp4.executeScript("arguments[0].scrollIntoView(true);",stateSelect);


        zipcodeInputLable.sendKeys(zipcode);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        emailInputLable.sendKeys(email);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        passwordInputLable.sendKeys(pass);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        confirmpassInputLable.sendKeys(confpass);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JavascriptExecutor temp5 = (JavascriptExecutor)driver;
        temp5.executeScript("arguments[0].scrollIntoView(true);",completBookingButton);

        completBookingButton.click();

    }
}
