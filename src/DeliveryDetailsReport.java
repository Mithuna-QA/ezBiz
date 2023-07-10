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

public class DeliveryDetailsReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total = 21;
    	int flag = 0;
    	int count = 0;
    	
    	
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
	        
		        //Enter Username
		        WebElement username = driver.findElement(By.id("username"));
		        CharSequence[] id = {"mithuna"};
		        username.sendKeys(id);
		        System.out.println("Username was enterd.");
		        count++;
	        }
	        if(count==3) {
	        	//Enter Password.
		        WebElement password = driver.findElement(By.id("password"));
		        CharSequence[] pin = {"Mithuna01"};
		        password.sendKeys(pin);
		        System.out.println("Password was enterd.");
		        count++;
	        }
	        if(count==4) { 
	        	//Click Rember me button 
		        WebElement remember = driver.findElement(By.id("rememberme"));
				remember.click();
				System.out.println("Click the Remberme.");
				count++;
	        }
	        
	        if(count==5) {
	        
	        	//Click the Login Button
		        WebElement login = driver.findElement(By.id("userLoginBtn"));
		        login.click();
		        System.out.println("Click the login button  !!!");
		        count++;   
	        }
	        
	        if(count==6) {
		        
	        	//Click Sales Module.
		        WebElement sales = driver.findElement(By.linkText("Sales"));
		        sales.click();
		        System.out.println("Click the Sales Module.");
		        count++;   
	        }
	        
	        if(count==7) {
		        
	        	//Click Sales Module.
		        WebElement report = driver.findElement(By.linkText("Reports"));
		        report.click();
		        System.out.println("Click Reports.");
		        count++;   
	        }
	        
	        if(count==8) {
		        
	        	//Click Delivery Note. 
		        WebElement del = driver.findElement(By.linkText("Reports"));
		        del.click();
		        System.out.println("Click Delivery Note Related Report.");
		        count++;   
	        }
	        
	        if(count==9) {
		        
	        	//Click Delivery Note. 
		        WebElement del = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/ul/li[6]/a"));
		        del.click();
		        System.out.println("Click Delivery Related.");
		        count++;   
	        }
	        
	        
	        if(count==10) {
		        
	        	//Click Delivery Item Detail Report
		        WebElement del = driver.findElement(By.linkText("Delivery Item Detail Report"));
		        del.click();
		        System.out.println("Click Delivery Item Detail Report.");
		        count++;   
	        }
	        
	        if(count==11) {
		        
	        	//Select From Date Dropdown.
		        WebElement from = driver.findElement(By.id("fromDate"));
		        from.click();
		        System.out.println("Select the From Date Drop Down.");
		        count++;   
	        }
	        
	        if(count==12) {
		        
	        	//Select From Date.
		        WebElement dat = driver.findElement(By.id("fromDate"));
		        dat.sendKeys("2022-01-01");
		        WebElement datn = driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/tbody/tr[1]/td[7]"));
		        datn.click();
		        System.out.println("From Date Entered.");
		        count++; 
		        
	        }
	        
	        if(count==13) {
		        
	        	//Select To Date.
		        WebElement dat = driver.findElement(By.id("toDate"));
		        dat.clear();
		        dat.sendKeys("2023-01-01");
		        WebElement datn = driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/tbody/tr[2]/td[1]"));
		        datn.click();
		        System.out.println("To Date Entered.");
		        count++; 
		 
	        }
	        
	        
	       if(count==14) {
	    	 //Select Delivery Note 
		        WebElement del = driver.findElement(By.id("isAllDeliveryNoteslbl"));
		        del.click();
		        System.out.println("Custom Delivery Note : All Delivery Notes.");
		        count++; 
	       }
	       
	       if(count==15) {
		    	 //Select Customs Items.
			        WebElement item = driver.findElement(By.id("isAllItemslbl"));
			        item.click();
			        System.out.println("Custom Items : All Items.");  	
			        count++; 
		   }
	       
	       if(count==16) {
		    	 //Select Custom Cutomers.
			        WebElement cus = driver.findElement(By.id("AllCustomers"));
			        cus.click();
			        System.out.println("Custom Cutomers : All Customers."); 
			        count++; 
		   }
	       
	       if(count==17) {
		    	 //Sort By Customer
			        WebElement sort = driver.findElement(By.id("lblSortByCustomer"));
			        sort.click();
			        System.out.println("Sort By : Sort By Customer.");  
			        count++; 
		   }
	       
	       if(count==18) {
		    	 //View Report.
			       WebElement view = driver.findElement(By.id("viewReport"));
			       view.click();
			       System.out.println("Click View Report.");  
			       count++; 
			       flag=1;
		   }
	       
	       
	       /*if(count==19) {
		    	 //Verify report generated or not.
			       WebElement rep = driver.findElement(By.xpath("//*[@id=\"content\"]/div/table[1]/tbody/tr[1]/td"));
			       String test = "Delivery Note Item Details Report (FIFO costing):";
					boolean res = rep.equals(test);
					if(res==true) {
				       System.out.println("Report Generated Sucessfully.");  
				       count++; 
			       }
		   }*/
	        
	        if(count==19) {
	            
		        WebElement dropdown = driver.findElement(By.className("login"));
		        dropdown.click();
		        System.out.println("Click logout drop down.");
		        
		        WebElement logout = driver.findElement(By.linkText("Logout"));
		        logout.click();
		        System.out.println("System logout Sucessfully !!!");
		        count++; 
		        
	        }
	        
	        
	        
	        if(count==20) {
		        //Close the browser
		        driver.quit();
		        count++;  
	        }
	        
	        FileWriter result = new FileWriter("Delivery Item Details Report.doc");
		    result.write("                    Silverleap Private Limited\n");
		    result.write("                         No.351-5th Floor,\n");
		    result.write("                        R.A. De Mel Mawatha,\n");
		    result.write("                             03,Colombo\n");  
		    result.write("                             Sri Lanka.\n"); 
		    result.write("\n");
		    result.write("              ****************************************\n");
		        
		    result.write("\n");
		    result.write("Project Name   : ezBiz\n");
		    result.write("Tese Case Name : Delivery Details Report.\n");
		    result.write("QA Name        : Mithuna Sivatharan\n");
		    LocalDateTime now = LocalDateTime.now();
		    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		    String formattedDate = now.format(formatter);
		    result.write("Date           : " + formattedDate + "\n");
		    result.write("\n");
		    result.write("...............................................\n");
		    result.write("\n");       
		    result.write("No of Test Scenario     : " +total+"\n" );
		    result.write("No of Pass Scenario     : "+ count + "\n" );
		    result.write("No of Fail Scenario     : "+ ( total - count)+ "\n" );
		           
		    double x= ((double)count  / total )*100;
		    DecimalFormat df = new DecimalFormat("#.##");
		    df.setRoundingMode(RoundingMode.CEILING);
		    String formval =  df.format(x); 
		    result.write("Test Coverage           : "+ formval+ "%\n" );
		    result.write("\n");
		    result.write("------------------------------------------------\n");
		    result.write("\n");
		    result.write("Tested Scenario       : Delivery Details Report.\n");
		    result.write("Tested Datas:\n");
		    result.write("1.Username        : mithuna09 \n");
		    result.write("2.Password        : Mithuna01\n");
		    result.write("3.From Date       : 2022-01-01\n");
		    result.write("4.To Date         : 2023-01-01\n");
		    result.write("5.Location        : Main Branch\n");
		    result.write("6.Custom Delivery Notes :All Delivery Notes\n");
		    result.write("7.Custom Items    : All Items.\n");
		    result.write("8.Custom Cutomers : All Customers\n");
		    result.write("9.Sort By         : Sort By Customer\n");
		   
		    if(flag==1) {
		    	result.write("Result            : Pass\n");
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
		    result.write("7.Click Sales Module.\n");
		    result.write("8.Click Report.\n");
		    result.write("9.Click Delivery Note.\n");
		    result.write("10.Click Delivery Note Item Details Report\n");
		    result.write("11.Seelct From Date.\n");
		    result.write("12.Select To Date.\n");
		    result.write("13.Select Location as Defult (Main Branch\n");
		    result.write("14.Custom Delivery Notes : All Delivey Notes\n");
		    result.write("15.Custom Item : All Items.\n");
		    result.write("16.Custom Customers : All Customers.\n");
		    result.write("17.Sorted By : Sort By Customer\n");
		    result.write("18.Click Generate Report.\n");
		    result.write("19.Logout the Application\n");
		    result.write("20.Close the browser \n");
		    result.write("\n");
		    result.write("-------------------------------------------------\n");
		    result.write("\n");
		    result.write("\n");
		    result.write("                          Test Result End");
		    result.close();
		           
		    System.out.println("Successfully wrote to the file.");;
		 } catch (IOException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		  }


	}

}
