package pageObjects;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class RegisterFormPage extends BasePage {

    public WebDriver driver;

    public RegisterFormPage() throws IOException {
    }

    public void getFirstNameField () throws IOException{
        this.driver = getDriver();
        By firstName = By.cssSelector("#firstname");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(firstName)).sendKeys("Alfredo");
    }

    public void getLastNameField () throws IOException {
        this.driver = getDriver();
        By lastName = By.cssSelector("#lastname");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(lastName)).sendKeys("Tester");
    }

    public void getEmailField () throws IOException {
        this.driver = getDriver();
        By emailField = By.cssSelector("#email_address");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(emailField)).sendKeys("testing@p202.com");
    }

    public void getPasswordField () throws IOException {
        this.driver = getDriver();
        By password = By.cssSelector("#password");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys("123test*");
    }

    public void getConfirmPasswordField () throws IOException {
        this.driver = getDriver();
        By confirmPass = By.cssSelector("#password-confirmation");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(confirmPass)).sendKeys("123test*");
    }

    public void getRegisterBtn () throws IOException {
        this.driver = getDriver();
        By registerBtn = By.cssSelector("button[title='Create an Account'] span");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(registerBtn)).click();
    }

}
