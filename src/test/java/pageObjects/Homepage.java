package pageObjects;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class Homepage extends BasePage {

    public WebDriver driver;

    By womenLink = By.xpath("//span[normalize-space()='Women']");

    public Homepage() throws IOException {
    }

    public void getSignInLink () throws IOException{
        this.driver = getDriver();
        By signInBtn = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(visibilityOfElementLocated(signInBtn));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]"))).click();
    }

    public void getCreateAccount () throws IOException{
        this.driver = getDriver();
        By createAccBtn = By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(visibilityOfElementLocated(createAccBtn));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']"))).click();
    }

    public void getWomenProdLink () throws IOException{
        this.driver = getDriver();
        By womenLink = By.cssSelector("a[id='ui-id-4'] span:nth-child(2)");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(womenLink)).click();
    }

    public WebElement getWomenLink() throws IOException {
        this.driver = getDriver();
        return driver.findElement(womenLink);
    }



}
