package selenium.git.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GitPractice {

	WebDriver driver;

	@Test
	public void openBrowser()
	{

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");

	}
	@Test
	public void openBrowser2()
	{

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");

	}
}
