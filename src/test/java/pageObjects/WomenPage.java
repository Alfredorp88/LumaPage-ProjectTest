package pageObjects;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class WomenPage extends BasePage {

    public WebDriver driver;

    public WomenPage() throws IOException {
    }

    public void getHoodiesSweatdhirts() throws IOException{
        this.driver = getDriver();
        By hoodies = By.xpath("//a[contains(text(),'Hoodies & Sweatshirts')]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(hoodies)).click();
    }
    public void getJackets() throws IOException{
        this.driver = getDriver();
        By jackets = By.xpath("//a[contains(text(),'Jackets')]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(jackets));
    }

}
