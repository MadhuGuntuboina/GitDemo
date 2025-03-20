package seleniumintroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void email()
	{
		WebDriver driver= (WebDriver) new ChromeDriver();
		System.out.println("write");
		 System.out.println("read");
		 System.out.println("play");
	}
	@Test
	public void password()
	{
		WebDriver driver= (WebDriver) new ChromeDriver();
		System.out.println("Tetsin1");
		 System.out.println("Book");
		 System.out.println("Pen");
	}

}
