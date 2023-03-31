import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertJunitTest {
	static WebDriver wd=null;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\95\\chromedriver.exe");
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8082/SeleniumWebTest/index.html");
		
	}
	
	public static String seleniumcode(String value) throws InterruptedException {
		wd.findElement(By.name("user")).sendKeys(value);
		Thread.sleep(2000);
		wd.findElement(By.name("submit")).submit();
		Thread.sleep(2000);
		return wd.findElement(By.name("h1")).getText();
		
	}

	@Test
	public void test1() throws InterruptedException {
		String actualresult=seleniumcode("swati");
		String expectedresult="Insertion Successful";
		assertEquals(expectedresult,actualresult);
		
	}
	
	@Test
	public void test2() throws InterruptedException {
		
		String actualresult=seleniumcode("aarna");
		String expectedresult="Insertion Successful";
		assertEquals(expectedresult,actualresult);
		
	}
   @After
	public void closebrowser() {
		
		//to close only one browser.
		wd.close();
		
		
	}
 //for close all the browser at once.
 		//wd.quit();
}
