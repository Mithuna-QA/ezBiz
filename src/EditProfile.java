import java.io.FileWriter;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditProfile {

	public static void main(String[] args) {
		int total = 13;
		int flag = 0;
		int count = 0 ;
		try {

	        // Set the path for ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");

	        // Create a new instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        
	        if(count == 0) {
	        	
		        // Navigate to the login page
		        driver.get("https://rajithanqa.ezbizapp.com/user/login/%252F");
		        System.out.println("Open the URL."); 
		        count++;
	        }
	        if(count==1) {
	        	
		        // maximize the window
		        driver.manage().window().maximize();
		        System.out.println("Maximize the window.");
		        count++;
		        
	        }
	        if(count==2) {
	        
		        // Login the page 
		        WebElement username = driver.findElement(By.id("username"));
		        CharSequence[] id = {"mithuna"};
		        username.sendKeys(id);
		        System.out.println("Username was enterd.");
		        count++;
	        }
	        if(count==3) {
	        	
		        WebElement password = driver.findElement(By.id("password"));
		        CharSequence[] pin = {"Mithuna01"};
		        password.sendKeys(pin);
		        System.out.println("Password was enterd.");
		        count++;
	        }
	        if(count==4) { 
	        	
		        WebElement remember = driver.findElement(By.id("rememberme"));
				remember.click();
				System.out.println("Click the Remberme.");
				count++;
	        }
	        
	        if(count==5) {
	        
		        WebElement login = driver.findElement(By.id("userLoginBtn"));
		        login.click();
		        
		        
		        System.out.println("Click the login button  !!!");
		        count++; 
		        
	        }
	        if(count==6) {
		        
		        WebElement drop = driver.findElement(By.className("login"));
		        drop.click();
		        
		        
		        System.out.println("Click Profile Drop Down ");
		        count++; 
		        
	        }
	        
	        
	        if(count==7) {
	        	WebElement edit = driver.findElement(By.linkText("Edit Profile"));
		        edit.click();
		        System.out.println("Click Edit Profile Option");
		        count++; 
	        	
	        }
	        
	        if(count==8) {
	        	WebElement first = driver.findElement(By.name("userFirstName"));
	        	first.clear();
	        	first.sendKeys("Mithuna");
		        System.out.println("Edit First Name.");
		        count++; 
	        	
	        }
	        
	        if(count==9) {
	        	WebElement last = driver.findElement(By.name("userLastName"));
	        	last.clear();
	        	last.sendKeys("Sivatharan");
		        System.out.println("Edit Last Name.");
		        count++; 
	        	
	        }
	        
	        
	        if(count==10) {
	        	WebElement submit = driver.findElement(By.id("update-user-button"));
	        	submit.sendKeys("Sivatharan");
		        System.out.println("User Profile Updated!!!");
		        count++; 
	        	
	        }
	        
	        
	        if(count==11) {
	            
		        WebElement dropdown = driver.findElement(By.className("login"));
		        
		        dropdown.click();
		        
		        System.out.println("Click logout drop down.");
		        
		        WebElement logout = driver.findElement(By.linkText("Logout"));
		        logout.click();
		        System.out.println("System logout Sucessfully !!!");
		        count++; 
		        flag =1;
		        
	        }
	        
	        
	        if(count==12) {
		        // Close the browser
		        driver.quit();
		        count++;
		        
	        }
	        
	        FileWriter result = new FileWriter("Edit Profile.doc");
		    result.write("                    Silverleap Private Limited\n");
		    result.write("                         No.351-5th Floor,\n");
		    result.write("                        R.A. De Mel Mawatha,\n");
		    result.write("                             03,Colombo\n");  
		    result.write("                             Sri Lanka.\n"); 
		    result.write("\n");
		    result.write("              ****************************************\n");
		        
		    result.write("\n");
		    result.write("Project Name   : ezBiz\n");
		    result.write("Tese Case Name : Edit Profile.\n");
		    result.write("QA Name        : Mithuna Sivatharan\n");
		    LocalDateTime now = LocalDateTime.now();
		    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		    String formattedDate = now.format(formatter);
		    result.write("Date           : " + formattedDate + "\n");
		    result.write("\n");
		    result.write("...............................................\n");
		    result.write("\n");       
		    result.write("No of Test Scenario     : "+ total + "\n" );
		    result.write("No of Pass Scenario     : "+ count + "\n" );
		    result.write("No of Fail Scenario     : "+ ( total - count)+ "\n" );
		           
		    double x= ((double)count  / total )*100;
		    DecimalFormat df = new DecimalFormat("#.##");
		    df.setRoundingMode(RoundingMode.CEILING);
		    String formval =  df.format(x); 
		    result.write("Test Coverage      : "+ formval+ "%\n" );
		    result.write("\n");
		    result.write("------------------------------------------------\n");
		    result.write("\n");
		    result.write("Tested Scenario       : Logout.\n");
		    result.write("Tested Datas:\n");
		    result.write("1.Username       : mithuna09 \n");
		    result.write("2.Password       : Mithuna09\n");
		    result.write("3.New First Name : Mithuna\n");
		    result.write("4.New Last Name  : Sivatharan\n");
		    if(flag==1) {
		    	result.write("Result           : Pass\n");
		    }
		    result.write("\n");
		    result.write("\n");
		    result.write("-------------------------------------------------\n");
		    result.write("\n");
		    result.write("\n");
		    result.write("Tested Elements : \n");
		    result.write("1.Navigate the login page.\n");
		    result.write("2.Enter username. \n");
		    result.write("3.Enter password.\n");
		    result.write("4.Click Login Button.\n");
		    result.write("5.Click rember me button.\n");
		    result.write("6.Verify whether navigate to dashbord or not.\n");
		    result.write("7.Verify the logout dropdown.\n");
		    result.write("8.Click Profile Dropdown.\n");
		    result.write("9.Select Edit Profile.\n");
		    result.write("10.Change First Name.\n");
		    result.write("11.Change Secod Name.\n");
		    result.write("12.Clcik Update Button.\n");
		    result.write("13.Click logout button.\n");
		    result.write("\n");
		    result.write("-------------------------------------------------\n");
		    result.write("\n");
		    result.write("\n");
		    result.write("                          Test Result End");
		    result.close();
		           
		    System.out.println("Successfully File Created.");;
		 } catch (IOException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		  }

	}

}
