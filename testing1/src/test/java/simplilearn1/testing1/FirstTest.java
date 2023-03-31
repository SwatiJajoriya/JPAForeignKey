package simplilearn1.testing1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	 WebDriver wd;
	 
	 //In an arg, if the config value is missing from the xml file then you can config still 
	    //the parameter with a default value by using @Optional.
	 
	 @Parameters("browser")
	    @BeforeTest
         public void config(@Optional("chrome") String browser) {
	      	 
	      	 switch(browser) {
	      	 case "chrome":WebDriverManager.chromedriver().setup();
	      					 wd=new ChromeDriver();    
	      					 break;
	      	 case "firefox": WebDriverManager.firefoxdriver().setup();
	      					 wd=new FirefoxDriver();
	      					 break;
	      	 }
	      	 
	      	   wd.manage().window().maximize();
	       }


	    @Parameters("url1")
	  @Test
	  public void test1(String url1) {
	      wd.get(url1);
	      //wd.get("https://www.google.com/");
	      String title=wd.getTitle();
	      assertEquals("Google",title,"title not matched");
	      System.out.println("done");
	      assertEquals("https://www.google.com/",wd.getCurrentUrl(),"url not matched");
	    
	  }
	 
	  @Parameters("url2")
	  @Test
	  public void test2(String url2) throws InterruptedException {
	      wd.get(url2);
	      Thread.sleep(2000);
	    //  wd.get("https://www.amazon.in/");
	    
	  }
	 
	  @AfterTest
	  public void closing() {
	      wd.quit();
	  }
	}

