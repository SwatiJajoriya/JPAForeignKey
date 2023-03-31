import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Selenium has only UI components accessibility .
//Selenium alone cannot perform any sort of testing, it doesn't have any testing component in it,
//until we provide some sort of testing component either by conditional statements or by JUnit or TestNg.
//For testing with selenium ,always run on a Main.
//Configure build path with all the Selenium Jar files,from 95 folder,lib folder 

public class TestMain {
	
	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException {
		
		//selenium testing with Conditional Statements if/else
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\95\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8082/SeleniumWebTest/index.html");
		Thread.sleep(2000);
		//UI level testing
		String expecteddbvalue="swati";
		wd.findElement(By.name("user")).sendKeys(expecteddbvalue);
		Thread.sleep(2000);
		wd.findElement(By.name("submit")).submit();
		Thread.sleep(2000);
		String actualresult=wd.findElement(By.name("h1")).getText();
		String expectedresult="Insertion Successful";
		
		//DB level testing
		String sql="select * from User";
		Connection con=DBUtil.getConnection();
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs= ps.executeQuery();
		String actualvalue="";
		while(rs.next()) {
			actualvalue=rs.getString(1);
			
		}
		   //UI level condition                   //DB level condition
		if(actualresult.equals(expectedresult)&&actualvalue.equals(expecteddbvalue)) {
			System.out.println("testcase passed");
			
		}
		else {
			System.out.println("testcase failed");
		}
		
		
	}

}
