import java.util.*;
import java.io.*;

public class MainClass {
	
	static Scanner sc= new Scanner(System.in);
	
	static int min_acc_bl;
	static int withdraw_limit;
	static int deposit;
	
	//BankAccount type= new BankAccount(min_acc_bl, withdraw_limit, deposit);
	BankAccount type= new BankAccount(min_acc_bl, withdraw_limit, deposit);
	
	public static void main(String args[]) {
		int choice;
		System.out.println("Enter type of account: ");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		System.out.println("3. Salary Account");
		choice= sc.nextInt();
		
		switch(choice) {
		case 1:
			SavingsAccount SA= new SavingsAccount(10000,25000,50000);
			System.out.println("Account created successfully!");
			SA.getInfo_SA();
			break;
		case 2:
			CurrentAccount CA= new CurrentAccount(25000,100000,100000);
			System.out.println("Account created successfully!");
			CA.getInfo_SA();
			break;
		case 3:
			SalaryAccount SaA= new SalaryAccount(100000,100000,50000);
			System.out.println("Account created successfully!");
			SaA.getInfo_SA();
			break;
		
		}
			
	}
}
