package SeleniumSeries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ydtwebstaging.com/");

	}

}
