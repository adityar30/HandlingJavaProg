import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://ibank.standardchartered.co.in/nfs/login.htm?_ga=2.223648667.1058604977.1528527371-1116326062.1528527371");

		Set<String> allwindowsId = driver.getWindowHandles();
		Iterator<String> it = allwindowsId.iterator();
		String mainWindowId = it.next();
		System.out.println("main Window Id is" + mainWindowId);

		WebElement PhoneBankinglink = driver.findElement(By.xpath(
				"//*[@id=\"command\"]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody[2]/tr[2]/td/table/tbody/tr[1]/td[3]/table/tbody/tr/td/table[1]/tbody/tr[2]/td[2]/ul/li[1]/a[1]"));
		PhoneBankinglink.click();

		Thread.sleep(3000);

		allwindowsId = driver.getWindowHandles();
		it = allwindowsId.iterator();
		it.next();

		String childwindowId = it.next();
		System.out.println("Second Window ID" + childwindowId);
		driver.switchTo().window(childwindowId);

		WebElement Gethelp = driver.findElement(By.xpath("//*[@id=\"sc-lb-module-footer\"]/div/div[2]/ul/li[4]/a"));
		Gethelp.click();

		driver.close();

		driver.switchTo().window(mainWindowId);

		System.out.println("Back to Main Window");

		Thread.sleep(3000);

		driver.quit();
	}

}
