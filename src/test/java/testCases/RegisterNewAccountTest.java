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

import java.io.IOException;

@Listeners(CustomListener.class)

public class RegisterNewAccountTest extends Hooks {
    public RegisterNewAccountTest() throws IOException {
    }

    @Test
    public void completeRegisterTest() throws IOException, InterruptedException {

        ExtentManager.log("Starting RegisterNewAccountTest...");

        Thread.sleep(2000);
        Homepage home = new Homepage();
        home.getCreateAccount();
        ExtentManager.pass("You will be redirected to the registration page.");

        RegisterFormPage register = new RegisterFormPage();
        register.getFirstNameField();
        register.getLastNameField();
        register.getEmailField();
        register.getPasswordField();
        register.getConfirmPasswordField();
        register.getRegisterBtn();
        ExtentManager.pass("Successful registration.");

        Thread.sleep(2000);

        ConfirmationPage confirm = new ConfirmationPage();
        System.out.println(confirm.getTitle().getText());

        try{
            //Este assert es boolean y espera dos elementos
            Assert.assertEquals(confirm.getTitle().getText(), "Thank you for registering with Main Website Store.");
            ExtentManager.pass("The text matches the expected info.");
        } catch (AssertionError e){
            Assert.fail("Text didn't match the expected info" + confirm.getTitle().getText() +
                    " expected - Thank you for registering with Main Website Store");
            ExtentManager.fail("The text didn't match the expected info.");
        }

    }
}
