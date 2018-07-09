import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); //initialize Chrome browser
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Navigated Successfully");
		System.out.println(driver.getCurrentUrl());
	}

}
