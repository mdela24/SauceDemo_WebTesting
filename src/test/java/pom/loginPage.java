package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class loginPage extends funcionesBasicas {
	
	By input_User = By.xpath("//form/div/input[@name='user-name']");
	By input_Pass= By.xpath("//form/div[2]/input[@name='password']");
	By titulo = By.xpath("//div[@id='header_container']/div[2]/span");
	By mensajeError = By.xpath("//h3[contains(.,'Epic sadface: Username and password do not match any user in this service')]");

	public loginPage(WebDriver driver) {
		super(driver);
	}

	public void login(String user, String pass) {
		try {
			this.sendKeys(input_User, user);
			Thread.sleep(1000);
			this.sendKeys(input_Pass, pass + Keys.TAB + Keys.ENTER);
		} catch (Exception e) {
			System.out.println("El metodo login ha fallado debido a: "+e);
		}
	}

	public void validarPage() {
		try {
			this.validarPagina( mensajeError, "Login fallido, volver a intentar",titulo,"Login exitoso");
		} catch (Exception e) {
			System.out.println("El metodo ValidarPage ha fallado debido a: " + e);
		}
	}
}
