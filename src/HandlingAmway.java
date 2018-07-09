import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAmway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialsize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amway.in/store/amway/en/INR/");

		WebElement NavigationMenuBar=driver.findElement(By.xpath("//*[@id=\"nav_main\"]/ul/li[4]/a"));
		Actions a=new Actions(driver);
		a.moveToElement(NavigationMenuBar).build().perform();
		
		WebElement MenuBaroption= driver.findElement(By.xpath("//*[@id=\"nav_main\"]/ul/li[4]/ul/li/ul[1]/li[6]/a"));
		MenuBaroption.click();
		
		WebElement Cart=driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div[2]/a"));
		System.out.println(Cart.getText());
		
		//WebElement AddtoCart=driver.findElement(By.xpath("//*[@type='submit']"));
		
		String xpathstart="/html/body/div[1]/div[3]/div[3]/div[2]/div[3]/div[";
		String xpathend="]/div[2]/div[2]/div[3]/form/div[2]/button";
		
		for (int i=1;i<=4;i++)
		{
			
			WebElement data=driver.findElement(By.xpath(xpathstart+i+xpathend));
			data.click();
		}
		
		System.out.println(Cart.getText());
		
		
		
		driver.close();
		driver.quit();
	}

}
