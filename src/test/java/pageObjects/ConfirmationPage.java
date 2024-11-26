package pageObjects;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ConfirmationPage extends BasePage {

    public WebDriver driver;

    public ConfirmationPage() throws IOException {
    }

    public WebElement getTitle() throws IOException{
        this.driver = getDriver();
        By title = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
        return driver.findElement(title);
    }

}
