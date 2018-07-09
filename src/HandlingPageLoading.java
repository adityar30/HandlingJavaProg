import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPageLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		
		
		long startTime=System.currentTimeMillis();

		String data= (String) ((JavascriptExecutor)driver).executeScript("return document.readyState");
		
		System.out.println(data);
		
		long endTime=System.currentTimeMillis(); 
		
		long totalTime=endTime-startTime;
		
		System.out.println("Total time to load Page "+totalTime+" millis sec");
		
		driver.close();
		driver.quit();
	}

}
