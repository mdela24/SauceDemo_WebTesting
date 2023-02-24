package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class productPage extends funcionesBasicas {

	By imagen2 = By.xpath("//img[contains(@class,'img')]");
	By imagen = By.xpath("//div[@class='inventory_item'][1]/div[@class='inventory_item_img'][1]");
	By addCart = By.xpath("//button[contains(.,'Add to cart')]");
	By backProduct = By.xpath("//button[contains(.,'Back to products')]");
	By btnAddCart= By.xpath("//a[@class='shopping_cart_link']");
	By btnMenu = By.xpath("//button[@id='react-burger-menu-btn']");
	By menu = By.xpath("//nav[@class='bm-item-list']");
	By btnReset = By.xpath("//nav/a[4]");
	By btnLogout= By.xpath("//nav/a[3]");
	
	public productPage(WebDriver driver) {
		super(driver);
	}
	
	public void selecProduct() {
		try {
			for (int i = 1; i<= 6; i++) {
				driver.findElement(By.xpath("//div[@class='inventory_item']" +"["+ i +"]" + "/div[@class='inventory_item_img'][1]")).click();
				WebElement imag = driver.findElement(imagen2);
				if (imag.isDisplayed()) {
					Thread.sleep(1000);
					this.clic(addCart);
					Thread.sleep(1000);
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait.until(ExpectedConditions.elementToBeClickable(backProduct));
					this.clic(backProduct);
					Thread.sleep(1000);
				}
			}
		} catch (Exception e) {
			System.out.println("El metodo selecProduct ha fallado debido a: ");
		}
	}

	public void cartProducts() throws InterruptedException {
		this.clic(btnAddCart);
		Thread.sleep(1000);
	}

	public void logout() {
		try {
			this.clic(btnMenu);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='bm-item menu-item']")));
			List<WebElement> list = driver.findElements(By.xpath("//a[@class='bm-item menu-item']"));
			for (int i = 0; i < list.size(); i++) {
				if (i == 1) {
					list.get(i).click();
					Thread.sleep(1000);
					driver.navigate().back();
				}
				if(i==2) {
					list.get(i).click();
				}
			}
		} catch (Exception e) {
			System.out.println("El metodo logout ha fallado debido a: ");
		}
	}
}
