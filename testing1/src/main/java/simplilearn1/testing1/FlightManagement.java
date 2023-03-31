package simplilearn1.testing1;

import org.testng.annotations.Test;

//If you have a sequence of @Test in a test file with test method names then the execution 
//follows the lexicographic notation(dictionary sequence) of the method names.
//Priority keeps the Test in sequence.
//If you don't mention the priority over methods,it takes the default value as 0 and it takes the first priority for the execution of the method
//Can you have -ve values as the priority? Yes and it takes the first priority for the execution of the method
//because it has the least priority.


public class FlightManagement {
	
		  @Test(priority = 1)
		  public void signUp() {
		      System.out.println("user is registered");
		  }
		 
		  @Test(priority = 2)
		  public void signIn() {
		      System.out.println("user sign In");
		  }
		 
		  @Test(priority = 3)
		  public void searchForFlight() {
		      System.out.println("search for flight");
		  }
		 
		  @Test(priority = 4)
		  public void bookTicket() {
		      System.out.println("book the ticket");
		  }
		 
		  @Test(priority = 5)
		  public void saveTicket() {
		      System.out.println("save the ticket");
		  }
		 
		  @Test(priority = 6)
		  public void payTicket() {
		      System.out.println("payment is done");
		  }
		 
		  @Test(priority = 7)
		  public void logOut() {
		      System.out.println("user is signedout");
		  }
		 
		}









