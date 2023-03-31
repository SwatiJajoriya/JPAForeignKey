//Steps for selenium coding :
//manual build path with the jars
//we need to define the path of the driver(.exe) required to be worked
//define the object for the driver 
//maximize the browser screen
//open the web page which u require to automate the UI components 
// do the operations
//close the browser



import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumWeb {
	
public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException {

		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\95\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().pageLoadTimeout(2000, TimeUnit.MILLISECONDS);
        wd.get("\"file:///D:/register.html\"");
		//if all the web elements require fixed time frame then Implicitly wait time bound applied over the elements.
		//if the web elements require different time frame then explicitly wait time bound applied.
        
//    	wd.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);

//when we r storing a WebElement reference we should not perform any action on the WebElement.		
        WebElement we1= wd.findElement(By.name("sid"));//wd , we , time ,action
    	WebElement we2=wd.findElement(By.name("sname"));
    	explicit(wd, we1, 200, "1");
    	explicit(wd,we2,300,"karthik");

			
			}
//any info regarding the browser,any info regarding the element,any info regarding the timeout,pass ur data for action
private static void explicit(WebDriver wd, WebElement we, int timeout, String sendkey) {
	                                    //In implicit we don't consider the ExpectedConditions
	                                    //Explicit consider the ExpectedConditions
	new WebDriverWait(wd, timeout).until(ExpectedConditions.visibilityOf(we));
	we.sendKeys(sendkey);

	
}


}
