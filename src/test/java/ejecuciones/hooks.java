package ejecuciones;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;

public class hooks {
	static WebDriver driver;
//	static AndroidDriver<WebElement> driver;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");	
	}
	
//	@Before("@Appium")
//	public void setupAppium() throws MalformedURLException {
//		DesiredCapabilities cap = new DesiredCapabilities();	
//		cap.setCapability("platformName", "Android");
//		cap.setCapability("deviceName", "emulator-5554");
//		cap.setCapability("noReset", true);
//		cap.setCapability("app","C:\\apk\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
//		cap.setCapability("noSign", true);
//		cap.setCapability("autoGranPermissions", true);
//		driver= new AndroidDriver<WebElement> (new URL("http://127.0.0.1:4723/wd/hub"), cap);
//	}
	
	static WebDriver getDriver() {
		return driver;
	}
	
	@After
	public void tearDown() {
//		driver.close();
	}

}
