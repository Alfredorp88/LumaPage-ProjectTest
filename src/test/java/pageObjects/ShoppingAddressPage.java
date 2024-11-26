package pageObjects;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class ShoppingAddressPage extends BasePage {

    public WebDriver driver;

    public ShoppingAddressPage() throws IOException {
    }

    public void getEmailField() throws IOException{
        this.driver = getDriver();
        By emailField = By.xpath("//div[@class='control _with-tooltip']//input[@id='customer-email']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(emailField)).sendKeys("testing@p202.com");
    }

    public void getPassField() throws IOException{
        this.driver = getDriver();
        By passField = By.cssSelector("#customer-password");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(passField)).sendKeys("123test*");
    }

    public void getLoginBtn() throws IOException{
        this.driver = getDriver();
        By loginBtn = By.cssSelector("span[data-bind=\"i18n: 'Login'\"]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }

    public void getFirstNameField() throws IOException{
        this.driver = getDriver();
        By firstNameField = By.xpath("//input[@id='T83MI43']");


        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement flag = driver.findElement(By.xpath("//input[@id='T83MI43']"));
        js.executeScript("arguments[0].scrollIntoView(true);", flag);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField)).clear();
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField)).sendKeys("Alfredo");
    }

    public void getLastNameField() throws IOException{
        this.driver = getDriver();
        By lastNameField = By.cssSelector("#YYRCO1U");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField)).clear();
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField)).sendKeys("Tester");
    }


    public void getIcon() throws IOException{
        this.driver = getDriver();
        By icon = By.cssSelector("span[class='google-symbols']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(icon)).click();
    }

    public void getCompanyField() throws IOException{
        this.driver = getDriver();
        By companyField = By.xpath("//input[@id='P52QRSV']");



        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.presenceOfElementLocated(companyField));
        wait.until(ExpectedConditions.elementToBeClickable(companyField)).sendKeys("P202");
    }

    public void getStreetField() throws IOException{
        this.driver = getDriver();
        By streetField = By.cssSelector("#YJYN6HN");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(streetField)).sendKeys("Cra 13 # 54 21");
    }

    public void getCityField() throws IOException{
        this.driver = getDriver();
        By cityField = By.cssSelector("#KOSQKCG");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(cityField)).sendKeys("Bogotá");
    }

    public void getStateField() throws IOException{
        this.driver = getDriver();
        By stateField = By.cssSelector("#HYX662O");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeSelected(stateField));

        Select itemState = new Select(driver.findElement(By.cssSelector("#HYX662O")));
        itemState.selectByVisibleText("Cundinamarca");
    }

    public void getZipcodeField() throws IOException{
        this.driver = getDriver();
        By zipecodeField = By.cssSelector("#QGSKGJL");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(zipecodeField)).sendKeys("213454");
    }

    public void getCountryField() throws IOException{
        this.driver = getDriver();
        By countryField = By.cssSelector("#B0V3BJ6");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeSelected(countryField));

        Select itemState = new Select(driver.findElement(By.cssSelector("#B0V3BJ6")));
        itemState.selectByVisibleText("Colombia");
    }

    public void getPhoneNumberField() throws IOException{
        this.driver = getDriver();
        By phoneField = By.cssSelector("#KI46EXN");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(phoneField)).sendKeys("9834986575");
    }

    public void getshipMethod1() throws IOException{
        this.driver = getDriver();
        By phoneField = By.cssSelector("input[value='tablerate_bestway']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(phoneField)).click();
    }

    public void getshipMethod2() throws IOException{
        this.driver = getDriver();
        By phoneField = By.cssSelector("input[value='flatrate_flatrate']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(phoneField)).click();
    }

    public void getNextBtn() throws IOException{
        this.driver = getDriver();
        By phoneField = By.cssSelector("span[data-bind=\"i18n: 'Next'\"]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(phoneField)).click();
    }




}
