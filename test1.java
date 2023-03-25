package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// when illegal setException error occur
		// System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.get("https://flipkart.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		

	}

}
