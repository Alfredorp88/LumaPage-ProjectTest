package pageObjects;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class ShopProductsPage extends BasePage {

    public WebDriver driver;

    public ShopProductsPage() throws IOException {
    }

    public void getSizeOption() throws IOException{
        this.driver = getDriver();
        By size = By.cssSelector("#option-label-size-143-item-167");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(size)).click();
    }
    public void getColor() throws IOException{
        this.driver = getDriver();
        By color = By.cssSelector("#option-label-color-93-item-56");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(color)).click();
    }
    public void getQuantity() throws IOException{
        this.driver = getDriver();
        By qty = By.cssSelector("#qty");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(qty)).clear();
        wait.until(ExpectedConditions.elementToBeClickable(qty)).sendKeys("2");
    }

    public void getAddCartBtn() throws IOException{
        this.driver = getDriver();
        By cartBtn = By.xpath("//span[normalize-space()='Add to Cart']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(cartBtn)).click();

    }

    public void getGoShoppingCart() throws IOException{
        this.driver = getDriver();
        By cartBtn = By.xpath("//a[normalize-space()='shopping cart']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(cartBtn)).click();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        //WebElement flag = driver.findElement(By.xpath("//a[normalize-space()='shopping cart']"));
        js.executeScript("window.scrollTo(0, 0);");

    }

}
