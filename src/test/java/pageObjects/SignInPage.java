package pageObjects;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class SignInPage extends BasePage {

    public WebDriver driver;

    public SignInPage() throws IOException {
    }

    public void getEmail() throws IOException{
        this.driver = getDriver();
        By email = By.cssSelector("#email");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(visibilityOfElementLocated(email));

        new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(email)).sendKeys("testing@p202.com");
    }

    public void getPassword() throws IOException{
        this.driver = getDriver();
        By password = By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(visibilityOfElementLocated(password));

        new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys("123test*");
    }

    public void getLoginBtn() throws IOException{
        this.driver= getDriver();
        By loginBtn = By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }

    public void getCreateAccLink() throws IOException{
        this.driver= getDriver();
        By newAccountLink = By.xpath("a[class='action create primary'] span");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(newAccountLink)).click();
    }

    public void getForgotLoginLink() throws IOException{
        this.driver= getDriver();
        By forgotLoginLink = By.xpath("a[class='action remind'] span");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(forgotLoginLink)).click();
    }
}
