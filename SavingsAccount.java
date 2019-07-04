import java.io.*;
import java.util.*;

public class SavingsAccount extends BankAccount{
	
	static Scanner sc= new Scanner(System.in);
	private static int counter=100;
	static int option;
	Address address = new Address("aditi","904","ruturang","411009");

 	public SavingsAccount(int min_acc_bl, int withdraw_limit, int deposit) {
		super(min_acc_bl, withdraw_limit, deposit);
	}
	
	static BankAccount user= new BankAccount(min_acc_bl, withdraw_limit, deposit);
	public void getInfo_SA() {
		System.out.println("The minimum account balance: "+min_acc_bl);
		System.out.println("The withdraw limit: "+withdraw_limit);
		System.out.println("The maximum amount that can be deposited: "+deposit);
		
		System.out.println("Welcome!");
		final int userid= (int) Math.round((counter+Math.random())*100);
		System.out.println("User id is: "+userid);
		
		int opt=1;
		do {
			System.out.println("----------------------------------");
			System.out.println("Menu \n 1. Add money \n 2. Withdraw money \n 3. Check balance \n 4. Add address \n 5. Display address \n 6. Display all information");
			System.out.println("Your option: ");
			option= sc.nextInt();
			System.out.println("----------------------------------");
			switch(option) {
				case 1:
					System.out.println("Enter amount to be added: ");
					int amt= sc.nextInt();
					user.addMoney(amt);
					break;
				case 2:
					System.out.println("Enter amount to be removed: ");
					int amt1= sc.nextInt();
					user.removeMoney(amt1);
					break;
				case 3:
					user.checkBalance();
					break;
				case 4:
					String name;
					String hno;
					String society;
					String pincode;
					System.out.println("Enter name: ");
					name= sc.next();
					address.setName(name);
					System.out.println("Enter housing no: ");
					hno= sc.next();
					address.setHno(hno);
					System.out.println("Enter society: ");
					society= sc.next();
					address.setSociety(society);
					System.out.println("Enter pincode: ");
					pincode= sc.next();
					address.setPincode(pincode);
					break;
				case 5:
					address.displayAddress();
					break;
				case 6:
					System.out.println("User id is: "+userid);
					address.displayAddress();
					user.checkBalance();
					break;
			}
		} while (opt==1);
	}		
}
