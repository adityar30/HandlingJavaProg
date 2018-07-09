import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdown {

	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); //initialize Chrome browser
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement Dropdown=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Dropdown.sendKeys("Oct");
		List<WebElement> dropdownvalues=Dropdown.findElements(By.tagName("option"));
		for (int x=0; x<dropdownvalues.size();x++)
		{
			System.out.println(dropdownvalues.get(x).getText());
		}
		//driver.close();
		driver.quit();
	}
}
