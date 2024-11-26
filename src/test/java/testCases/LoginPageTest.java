package testCases;

import Base.CustomListener;
import Base.ExtentManager;
import Base.Hooks;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.ConfirmationPage;
import pageObjects.Homepage;
import pageObjects.RegisterFormPage;
import pageObjects.SignInPage;

import java.io.IOException;

@Listeners(CustomListener.class)

public class LoginPageTest extends Hooks {
    public LoginPageTest() throws IOException {
    }

    @Test
    public void loginPageTest() throws IOException, InterruptedException {

        ExtentManager.log("Starting LoginPageTest...");

        Thread.sleep(2000);
        Homepage home = new Homepage();
        home.getSignInLink();
        ExtentManager.pass("You will be redirected to the registration page.");

        SignInPage signin = new SignInPage();
        signin.getEmail();
        signin.getPassword();
        signin.getLoginBtn();

        ExtentManager.pass("Successful login.");

        Thread.sleep(2000);

    }
}
