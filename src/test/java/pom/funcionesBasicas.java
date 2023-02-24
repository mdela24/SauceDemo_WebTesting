package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class funcionesBasicas {
	
	WebDriver driver;
	
	public funcionesBasicas(WebDriver driver) {
		this.driver= driver;
	}
	
	public void clic(By element) {
		driver.findElement(element).click();
	}
	
	public void sendKeys(By element, String mensaje) {
		driver.findElement(element).sendKeys(mensaje);
	}
	
	public void validarPagina(By element2, String mensaje2,By element, String mensaje) {
		try {
			if (driver.findElement(element2).isEnabled()) {
				System.out.println(mensaje2);
			} else {
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOfElementLocated(element));
				if(driver.findElement(element).isDisplayed()) {
					System.out.println(mensaje);
				}
			}
		}catch(Exception e) {
			System.out.println("El metodo validarPagina ha fallado debido a: "+e);
		}
	}
}
