package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class carroPage extends funcionesBasicas {
	
	By btnPagar = By.xpath("//button[contains(.,'Checkout')]");
	By inputFirstName = By.xpath("//form/div/div/input[@id='first-name']");
	By inputLastdName = By.xpath("//form/div/div[2]/input[@id='last-name']");
	By inputCodPostal = By.xpath("//form/div/div[3]/input[@id='postal-code']");
	By btnContinue = By.xpath("//input[contains(@id,'continue')]");
	By btnFinalizar = By.xpath("//div[@class='cart_footer']/button[2]");
	By btnVolver = By.xpath("//div[@id='checkout_complete_container']/button");

	public carroPage(WebDriver driver) {
		super(driver);
	}
	
	public void datosCart(String fName, String lName, String cPostal) {
		try {
			WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(btnPagar));

			WebElement element = driver.findElement(btnPagar);
			if(element.isEnabled()) {	
				JavascriptExecutor js =(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView();", element);
				element.click();
			}
			this.sendKeys(inputFirstName, fName);
			this.sendKeys(inputLastdName, lName);
			this.sendKeys(inputCodPostal, cPostal);
			Thread.sleep(1000);
			this.clic(btnContinue);
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println("El metodo datosCart ha fallado debido a: "+e);
		}
	}
	
	public void btnFinish() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(btnFinalizar));

			WebElement element = driver.findElement(btnFinalizar);
			if (element.isEnabled()) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView();", element);
				element.click();
			}
		}catch(Exception e) {
			System.out.println("El metodo btnFinish ha fallado debido a: "+e);
		}
	}
	
	public void btnVolver() {
		this.clic(btnVolver);
	}

}
