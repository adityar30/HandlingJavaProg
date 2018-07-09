import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialsize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

		WebElement Username = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]"));
		Username.sendKeys("Tester");

		WebElement Password = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]"));
		Password.sendKeys("test");
		
		WebElement Login = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']"));
		Login.click();

		Thread.sleep(3000);
		
		Set<Cookie>a=driver.manage().getCookies();
		Iterator<Cookie> it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		driver.close();
		driver.quit();
	}

}
