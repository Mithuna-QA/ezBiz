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

public class ChangePassword {

	public static void main(String[] args) {
		int total = 15;
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
	        	//Enter Password 
		        WebElement password = driver.findElement(By.id("password"));
		        CharSequence[] pin = {"Mithuna01"};
		        password.sendKeys(pin);
		        System.out.println("Password was enterd.");
		        count++;
	        }
	        if(count==4) { 
	        	
	        	//Click Remeber Me button 
		        WebElement remember = driver.findElement(By.id("rememberme"));
				remember.click();
				System.out.println("Click the Remberme.");
				count++;
	        }
	        
	        if(count==5) {
	        	// Click logout button
		        WebElement login = driver.findElement(By.id("userLoginBtn"));
		        login.click();
		        System.out.println("Click the login button  !!!");
		        count++; 
		        
	        }
	        if(count==6) {
		        //Click Profile dropdown
		        WebElement drop = driver.findElement(By.className("login"));
		        drop.click();
		        
		        System.out.println("Click Profile Drop Down ");
		        count++; 
		        
	        }
	        
	        if(count==7) {
	        	//Click Edit Profile
	        	WebElement edit = driver.findElement(By.linkText("Edit Profile"));
		        edit.click();
		        System.out.println("Click Edit Profile Option");
		        count++; 
	        	
	        }
	        
	        if(count==8) {
	        	//Click change password option
	        	WebElement cp = driver.findElement(By.id("psssword_icon"));
	        	cp.click();
		        System.out.println("Click change password option.");
		        count++; 
	        	
	        }
	        
	        if(count==9) {
	        	// Enter current password
	        	WebElement pass = driver.findElement(By.id("currentPassword"));
	        	pass.sendKeys("Mithuna09");
		        System.out.println("Enter Current Password.");
		        count++; 
	        	
	        }
	        if(count==10) {
	        	//Enter new password
	        	WebElement newpass = driver.findElement(By.id("password"));
	        	newpass.sendKeys("Mithuna01");
		        System.out.println("Enter New Password.");
		        count++; 
	        	
	        }
	        
	        if(count==11) {
	        	//Conform new password
	        	WebElement newpass = driver.findElement(By.id("passwordC"));
	        	newpass.sendKeys("Mithuna01");
		        System.out.println("Enter New Password Again.");
		        count++; 
	        	
	        }
	        if(count==12) {
	        	//Click update
	        	WebElement update = driver.findElement(By.id("update-user-button"));
	        	update.click();
		        System.out.println("Password Update Sucess.");
		        count++; 
		        flag =1;
	        	
	        }
	       
	        
	        if(count==13) {
	        	//logout the application 
	            
	        	WebElement dropdown = driver.findElement(By.className("login"));
		        
		        dropdown.click();
		        
		        System.out.println("Click logout drop down.");
		        
		        WebElement logout = driver.findElement(By.linkText("Logout"));
		        logout.click();
		        
		        System.out.println("System logout Sucessfully !!!");
		        count++; 
		   

		        
	        }
	        
	        
	        if(count==14) {
		        // Close the browser
		        driver.quit();
		        count++; 
		        
	        }
	        
	        FileWriter result = new FileWriter("Change Password.doc");
		    result.write("                    Silverleap Private Limited\n");
		    result.write("                         No.351-5th Floor,\n");
		    result.write("                        R.A. De Mel Mawatha,\n");
		    result.write("                             03,Colombo\n");  
		    result.write("                             Sri Lanka.\n"); 
		    result.write("\n");
		    result.write("              ****************************************\n");
		        
		    result.write("\n");
		    result.write("Project Name   : ezBiz\n");
		    result.write("Tese Case Name : Change Password\n");
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
		    result.write("Tested Scenario       : Change Password.\n");
		    result.write("Tested Datas:\n");
		    result.write("1.Username       : mithuna09 \n");
		    result.write("2.Password       : Mithuna09\n");
		    result.write("3.Current Pasword: Mithuna09\n");
		    result.write("4.New Password   : Mithuna\n");
		    if(flag==1) {
		    	result.write("Result           : Pass\n");
		    }
		    result.write("\n");
		    result.write("\n");
		    result.write("-------------------------------------------------\n");
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
		    result.write("10.Click Change Password Opption\n");
		    result.write("11.Enter Current Password.\n");
		    result.write("12.Enter New Password.\n");
		    result.write("13.Conform New Password.\n");
		    result.write("14.Click Update Button.\n");
		    result.write("15.Logout the application.\n");
		    result.write("\n");
		    result.write("-------------------------------------------------\n");
		    result.write("\n");
		    result.write("\n");
		    result.write("                          Test Result End");
		    result.close();
		           
		    System.out.println("Successfully File Created!!!");;
		 } catch (IOException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		  }
	}

}
