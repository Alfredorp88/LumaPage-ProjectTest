package pageObjects;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class ShoppingCartPage extends BasePage {

    public WebDriver driver;

    public ShoppingCartPage() throws IOException {
    }

    public void getQuantity() throws IOException{
        this.driver = getDriver();
        By quantity = By.cssSelector("#cart-420784-qty");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(quantity)).clear();
        wait.until(ExpectedConditions.elementToBeClickable(quantity)).sendKeys("2");
    }

    public void getDeleteItem1() throws IOException {
        this.driver = getDriver();
        By deleteItem1 = By.cssSelector(".action.action-delete");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(deleteItem1)).click();
    }

    public void getProceedCheckout() throws IOException {
        this.driver = getDriver();
        By proceedCheckout = By.cssSelector("button[title='Proceed to Checkout'] span");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(proceedCheckout)).click();
    }

    public void getCheckoutMultiAdresses() throws IOException {
        this.driver = getDriver();
        By multiAdresses = By.cssSelector("a[class='action multicheckout'] span");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(multiAdresses)).click();
    }

}
