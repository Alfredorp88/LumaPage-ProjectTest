package testCases;

import Base.CustomListener;
import Base.ExtentManager;
import Base.Hooks;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.IOException;

@Listeners(CustomListener.class)

public class BuyProductWomanTest extends Hooks {
    public BuyProductWomanTest() throws IOException {
    }

    @Test
    public void buyProductWomanTest() throws IOException, InterruptedException {

        ExtentManager.log("Starting BuyProductWomanTest...");

        Thread.sleep(2000);
        Homepage home = new Homepage();
        home.getWomenProdLink();
        ExtentManager.pass("Woman link products selected.");

        WomenPage category = new WomenPage();
        category.getHoodiesSweatdhirts();
        ExtentManager.pass("Category selected successfully.");

        WomenProductsPage prod = new WomenProductsPage();
        prod.getProduct1();
        ExtentManager.pass("Product selected successfully.");

        Thread.sleep(5000);

        ShopProductsPage item = new ShopProductsPage();
        item.getSizeOption();
        item.getColor();
        item.getQuantity();
        item.getAddCartBtn();
        item.getGoShoppingCart();

        Thread.sleep(5000);

        ShoppingCartPage cart = new ShoppingCartPage();
        cart.getProceedCheckout();

        Thread.sleep(2000);

        ShoppingAddressPage address = new ShoppingAddressPage();
        address.getEmailField();
        address.getPassField();
        address.getLoginBtn();
        /*address.getFirstNameField();
        address.getLastNameField();
        address.getIcon();*/
        Thread.sleep(7000);
        address.getCompanyField();
        address.getStreetField();
        address.getCityField();
        address.getCountryField();
        address.getStateField();
        address.getZipcodeField();
        address.getPhoneNumberField();
        address.getshipMethod1();
        address.getNextBtn();

        //ExtentManager.pass("Successful login.");





    }
}
