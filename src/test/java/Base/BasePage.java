package Base;

import lombok.Getter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import static jdk.internal.event.ExceptionStatisticsEvent.timestamp;

public class BasePage {

    private String url;
    private Properties prop;
    @Getter
    public static String screenShotDestinationPath;

    public BasePage() throws IOException{
        prop = new Properties();
        FileInputStream data = new FileInputStream("C:\\AutomationProjects\\LumaPage ProjectTest\\src\\main\\resources\\config.properties");
        prop.load(data);
    }

    public static WebDriver getDriver() throws IOException {
        return WebDriverInstance.getDriver();
    }

    public String getUrl() {
        url = prop.getProperty("url");
        return url;
    }

    public static String takeSnapShot (String name) throws IOException{
        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        String desFile = System.getProperty("user.dir") + "\\resources\\screenshots\\" +
                timestamp() + ".png";
        screenShotDestinationPath = desFile;

        try {
            FileUtils.copyFile(scrFile, new File(desFile));
        } catch (IOException e){
            e.printStackTrace();
        }
        return name;
    }

    public static  String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

    public static String getScreenShotDestinationPath() {
        return screenShotDestinationPath;
    }

    public static void waiForElementInvisible(WebElement element) throws IOException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }


}
