package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	WebDriver driver;
	public WebDriver launchBrowser(String browserName) {
			System.out.println("Broswer Name is: "+browserName);
			switch(browserName.trim().toLowerCase()) {
			case "chrome" : 
				driver = new ChromeDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			case "Safari":
				driver = new SafariDriver();
				break;
			default:
				System.out.println("Plead pass the right browser name: "+ browserName);
				throw new BrowserException("Invalid broswer name: "+ browserName);
			}
			return driver;
	}
	public void launchURL(String url) {
		if(url ==null) {
			throw new BrowserException("Invalid url: "+url);
		}
		if(url.isBlank() || url.isEmpty()) {
			throw new BrowserException("Blank or empty url" + url);
		}
		if(!url.startsWith("http")) {
			throw new BrowserException("Protocol is missing: "+url);
		}
		driver.get(url.trim());
		System.out.println("URL is launched");
	}
	public String getTitle() {
		return driver.getTitle();
	}
	public String getcurrentURL() {
		return driver.getCurrentUrl();
	}
	public void quitBrowser() {
		driver.quit();
	}
	public void closeBroswer() {
		System.out.println("Closing broswer");
		driver.close();
	}

}
