package githubCmdPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JenkinsPracticeTest{

	@Test
	public void name() {
		System.out.println("Jenkin_Test");
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get(url);
		 
	}
}
