package ejecuciones;

import org.openqa.selenium.WebDriver;

import pom.carroPage;
import pom.loginPage;
import pom.productPage;

public class objetos {
	protected WebDriver driver = hooks.getDriver();
	protected loginPage login = new loginPage(driver);
	protected productPage ecommerce = new productPage(driver);
	protected carroPage cartPage = new carroPage(driver);
}
