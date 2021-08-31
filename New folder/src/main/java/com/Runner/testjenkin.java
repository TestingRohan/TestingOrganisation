package main.java.com.Runner;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testjenkin {
	public static WebDriver driver;
	public static void test()
	{try {
		String name = System.getenv("Name");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://git-scm.com/download/win");
		List<WebElement> we = driver.findElements(By.xpath("//*[@id='content-wrapper']/aside/nav/ul/li[1]/a"));
		System.out.println(name);
		if(we.size()>0) {
			
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
		finally
		{
			driver.quit();
		}
	}

}
