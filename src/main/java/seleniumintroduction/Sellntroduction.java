package seleniumintroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sellntroduction {

	public static void main(String[] args) {
	 WebDriver driver= (WebDriver) new ChromeDriver();
	 driver.get("https://google.com");
	 driver.getTitle();
	 System.out.println("write");
	 System.out.println("read");
	 System.out.println("play");
	 
	 

	}

}
