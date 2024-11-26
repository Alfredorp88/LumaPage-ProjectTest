package pageObjects;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class WomenProductsPage extends BasePage {

    public WebDriver driver;

    public WomenProductsPage() throws IOException {
    }

    public void getProduct1() throws IOException{
        this.driver = getDriver();
        By prod1 = By.xpath("//img[@alt='Eos V-Neck Hoodie']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(prod1)).click();
    }
    public void getJackets() throws IOException{
        this.driver = getDriver();
        By jackets = By.xpath("//a[contains(text(),'Jackets')]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(jackets));
    }

}
