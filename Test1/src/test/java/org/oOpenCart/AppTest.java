package org.oOpenCart;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
	@Test
	public void launchURL(){
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		System.out.println("Page Title: "+driver.getTitle());
		System.out.println("User Successfully Navigated to Website");
	}
}
