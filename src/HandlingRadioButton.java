import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialsize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		List<WebElement> RadioGroup1=driver.findElements(By.name("group1"));
		System.out.println(RadioGroup1.size());
		for (int x=0; x<RadioGroup1.size();x++)
		{
			System.out.println(RadioGroup1.get(x).getAttribute("value")+"--"+RadioGroup1.get(x).getAttribute("checked"));
		}
		
		driver.close();
		driver.quit();

	}

}
