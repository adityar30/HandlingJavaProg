import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFireFoxProfile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialsize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		
		WebElement Datepicker=driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		Datepicker.sendKeys("04/04/2020");
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
		/*for(int i=0;i<5;i++)
		{
			DatepickerArrow.click();
		}*/
		
	/*	WebElement DatepickerArrow=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
		DatepickerArrow.click();
		
		WebElement DateSelectUsingArrow=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[1]/a"));
		DateSelectUsingArrow.click();*/
		
		/*WebElement CalenderDate=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]/a"));
		CalenderDate.click();*/
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		
		
	}

}
