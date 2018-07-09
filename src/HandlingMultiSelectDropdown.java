import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialsize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		
		WebElement MultiDropdown=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/div/form/p[6]/select"));
		
		
		Select a=new Select(MultiDropdown);
	/*	a.selectByIndex(0);
		a.selectByIndex(2);*/
		
		/*List<WebElement> g=a.getOptions();
		for (int i=0;i<g.size();i++)
		{
			a.selectByIndex(i);
		}*/

		//a.selectByValue("msmanual");
		//a.selectByVisibleText("Selenium");
		
		/*List<WebElement> f=a.getOptions();
		for (int i=0;i<f.size();i++)
		{
			System.out.println(f.get(i).getText());
			a.selectByIndex(i);
		}
	System.out.println(a.getFirstSelectedOption().getText());
	//	a.deselectAll();
	*/
	WebElement Dropdown=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/div/form/p[7]/select"));
	
	Select c=new Select(Dropdown);
	c.selectByIndex(2);
	
	c.selectByValue("ddperformance");
	
	c.selectByVisibleText("Automation Testing");
	
	System.out.println(c.getFirstSelectedOption().getText());
	
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		
		
	}

}
