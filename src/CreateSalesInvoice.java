import java.io.FileWriter;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateSalesInvoice {

	public static void main(String[] args) {
		int total = 15;
		int flag = 0;
		int count = 0 ;
		try {

	        // Set the path for ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");

	        // Create a new instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        Actions actions = new Actions(driver);
	        
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
	        	// Click Sales Module.
		        WebElement sales = driver.findElement(By.xpath("//*[@id=\"non-printable\"]/div/nav/div/div[2]/div/ul[1]/li[3]/a"));
		        sales.click();
		        System.out.println("Click the sales module.");
		        count++; 
		        
	        }
	        
	        if(count==7) {
	        	// Click Invoice.
		        WebElement sales = driver.findElement(By.linkText("Invoices"));
		        sales.click();
		        System.out.println("Click Invoice Feature.");
		        count++; 
		        
	        }
	        if(count==8) {
				
				
				// Find the dropdown menu element and click it to open the menu
				WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"add-new-item-row\"]/tr[2]/td[1]/div/div/button"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
			    js.executeScript("arguments[0].scrollIntoView();", dropdown);

			    dropdown.click();

				// Find the search field element and enter the search term
				WebElement searchField = driver.findElement(By.xpath("//*[@id=\"add-new-item-row\"]/tr[2]/td[1]/div/div/div/div[1]/input"));
				searchField.sendKeys("ITM007");

				// Wait for the search results to appear and select the desired option
				WebDriverWait wait = new WebDriverWait(driver, 10);
				WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='ITM007-FPOne-ITM007 - 20Qty']")));
				option.click();
				
				System.out.println("Item Selected.");
				
				count++;    
			}
	        
	 
	        if(count==9) {
	        	// Add item into Invoice.
	        	
	        	WebDriverWait wait = new WebDriverWait(driver, 10);
	        	WebElement quantityField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("quantity")));

	        	// Enter the desired quantity in the input field
	        	quantityField.sendKeys("10");
	        	
	        	
	        	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("deliverQuanity")));
	        	
	        	WebElement qty = driver.findElement(By.id("deliverQuanity"));
	        	qty.click();
		        System.out.println("Quantity Enterd.");
		        count++; 
		        
	        }
	        if(count==10) {
	        	// Add item into Invoice.
	        	WebElement plusIcon = driver.findElement(By.xpath("//*[@id=\"add-new-item-row\"]/tr[2]/td[9]"));

	        	// Click on the + icon
	        	plusIcon.click();
		        System.out.println("Item added to the invoice!!!");
		         
		        
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
		    result.write("Tese Case Name : Create Sales Invoice.\n");
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
		    result.write("Tested Scenario       : Create Sales Invoice.\n");
		    result.write("Tested Datas:\n");
		    result.write("1.Username       : mithuna09 \n");
		    result.write("2.Password       : Mithuna09\n");
		   
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
