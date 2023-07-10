import java.util.Scanner;

import SubModule.PurchaseRequstion;
import SubModule.Settings;
import SubModule.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Feature.Login;
import Feature.QALogin;
import Module.Account;
import Module.Purchase;

public class ezBiz {

	public static void main(String[] args) {

		int status = 1;

		System.setProperty("webdriver.chrome.driver", "D:/Automation/ezBiz/Driver/chromedriver_win32_3/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		do {
			// Call Login
			Login login = new Login();
			//QALogin qalogin =  new QALogin();

			// Call Maximize
			login.Maxmize(driver);
			//qalogin.Maxmize(driver);

			// Call Login
			login.login("mithuna", "Mithuna01", driver);
			//qalogin.login("Thinkcube", "Password@123", driver);

			System.out.println("Welcome to ezBiz Automation.");
			System.out.println("****************************");
			System.out.println("Select which Module You Need to Run :- ");
			System.out.println("1.Purchasing");
			System.out.println("2.Inventory");
			System.out.println("3.Sales");
			System.out.println("4.POS");
			System.out.println("4.JOBs");
			System.out.println("5.CRM");
			System.out.println("6.Accounting");
			System.out.println("7.END");

			System.out.println("****************************");

			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			Account acc = new Account();

			switch (input) {
			case 1:
				int flag =1;
				do {
					System.out.println("You Have Selected Purchasing  Module");
					System.out.println("----------------------------------");
					System.out.println(
							"Within the Purchasing module, there are 10 sub-modules to choose from. Which specific sub-module would you like to select?");
					System.out.println(
							"*************************************************************************************************************************");
					System.out.println("1.Suppliers");
					System.out.println("2.Purchase Requisition");
					System.out.println("3.Purchase Order");
					System.out.println("4.Purchase Invoice");
					System.out.println("5.Payments");
					System.out.println("6.Returns");
					System.out.println("7.Debit Note");
					System.out.println("8.Debit Note Payments");
					System.out.println("9.Material Requisition");
					System.out.println("10.Reports");
					System.out.println("11.Need to Run all Accounting Module Feature.");
					System.out.println("----------------------------------");
					int pur = scanner.nextInt();
					switch (pur) {
					case 1:
						System.out.println("You Have Selected Supplier Features. ");
	
						Supplier supp = new Supplier();
						supp.SupplierManagement(driver);
						supp.SupplierCategoryManagement(driver);
						// ssupp.SupplierImportManagement(driver);
						//qalogin.logout(driver);
						break;
	
					
					case 2:
						
					System.out.println("You Have Selected Purchase Requisition Features. ");
					PurchaseRequstion pr = new PurchaseRequstion();
					pr.PurchaseRequstionManagement(driver);
					//qalogin.logout(driver);
					login.logout(driver);
					break;

					}
				}while(flag ==1);
			case 2:
				System.out.println("You Have Selected Inventory Module");
				break;
			case 3:
				System.out.println("You Have Selected Sales Module");
				break;
			case 4:
				System.out.println("You Have Selected POS Module");
				break;
			case 5:
				System.out.println("You Have Selected JOBs Module");
				break;
			case 6:
				System.out.println("You Have Selected Accounting Module");
				System.out.println("----------------------------------");
				System.out.println(
						"Within the accounting module, there are 8 sub-modules to choose from. Which specific sub-module would you like to select?");
				System.out.println(
						"*************************************************************************************************************************");
				System.out.println("1.Settings");
				System.out.println("2.Expenses");
				System.out.println("3.Cash & Bank");
				System.out.println("4.Incomes");
				System.out.println("5.Accounts");
				System.out.println("6.Chart of Accounts");
				System.out.println("7.Journal Entries");
				System.out.println("8.Reports");
				System.out.println("9.Need to Run all Accounting Module Feature.");
				System.out.println("----------------------------------");
				int sub = scanner.nextInt();
				switch (sub) {
				case 1:
					System.out.println("You Have Selected Settings Sub Module");
					System.out.println("----------------------------------");
					System.out.println("There are 5 features available. Which feature do you need to run?");
					System.out.println("*****************************************************************");
					System.out.println("1.Bank");
					System.out.println("2.Account Type");
					System.out.println("3.Account");
					System.out.println("4.Petty Cash Expense Type");
					System.out.println("5.Card Type");
					System.out.println("6.All of these.");

					int feb = scanner.nextInt();
					Settings sett = new Settings();
					switch (feb) {
					case 1:
						System.out.println("You Have Selected Bank Features. ");
						sett.BankMangment(driver);
						//qalogin.logout(driver);
						login.logout(driver);
						break;

					case 2:
						System.out.println("You Have Selected Account Type Features. ");
						sett.AccountTypeManagement(driver);
						//qalogin.logout(driver);
						login.logout(driver);
						break;

					case 3:
						/*
						 * System.out.println("You Have Selected Account Features. ");
						 * 
						 * login.logout(driver); break;
						 */

					case 4:
						System.out.println("You Have Selected Petty Cash Expense Type Features. ");
						sett.PettyCashExpenseTypeManagement(driver);
						//qalogin.logout(driver);
						login.logout(driver);
						break;

					case 5:
						System.out.println("You Have Selected Card Type Type Features. ");
						sett.CardTypeMangment(driver);
						//qalogin.logout(driver);
						login.logout(driver);
						break;

					case 6:

						System.out.println("You Have Selected Card Type Type Features. ");
						sett.CardTypeMangment(driver);
						//alogin.logout(driver);
						login.logout(driver);
						break;

					default:
						System.out.println("You Have Selected Incorrect Opption, Try Again.");
						break;

					}
				}
			case 7:
				System.out.println("You Have Selected TO END the ezBiz Automation. ");
				System.out.println("Thank You for Your Time, Good Bye. ");
				status = 0;
				break;
			default:
				System.out.println("You Have Selected Incorrect Module, Try Again");
				break;
			}
		}while(status==1);

}

}