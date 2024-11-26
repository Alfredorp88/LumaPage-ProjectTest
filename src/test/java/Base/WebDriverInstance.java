package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebDriverInstance {

    public  static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver(){
        if (driver.get() == null){
            try {
                driver.set(createDriver());
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return driver.get();
    }

    public static WebDriver createDriver() throws IOException {
        WebDriver driver  = null;

        Properties prop = new Properties();
        FileInputStream data = new FileInputStream("C:\\AutomationProjects\\LumaPage ProjectTest\\src\\main\\resources\\config.properties");
        prop.load(data);

        //Forma flexible para iniciar la prueba determinando mediante configuracion el browser a utilizar.
        if(prop.getProperty("browser").equals("chrome")){
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") + "\\src\\test\\java\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (prop.getProperty("browser").equals("firefox")){
            System.setProperty("webdriver.gecko.driver",
                    System.getProperty("user.dir") + "\\src\\test\\java\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        assert driver != null;
        driver.manage().window().maximize();

        return driver;

    }

    public static void cleanupDriver(){
        driver.get().quit();
        driver.remove();
    }
}
