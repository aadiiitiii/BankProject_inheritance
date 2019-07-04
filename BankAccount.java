
public class BankAccount {
	static int min_acc_bl;
	static int withdraw_limit;
	static int deposit;
	int acc_bal;
	private int accountBalance;
	
	public BankAccount(int min_acc_bl, int withdraw_limit, int deposit) {
		this.min_acc_bl= min_acc_bl;
		this.withdraw_limit= withdraw_limit;
		this.deposit= deposit;
	}

	public int getMin_acc_bl() {
		return min_acc_bl;
	}

	public void setMin_acc_bl(int min_acc_bl) {
		this.min_acc_bl = min_acc_bl;
	}

	public int getWithdraw_limit() {
		return withdraw_limit;
	}

	public void setWithdraw_limit(int withdraw_limit) {
		this.withdraw_limit = withdraw_limit;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getAcc_bal() {
		return acc_bal;
	}

	public void setAcc_bal(int acc_bal) {
		this.acc_bal = acc_bal;
	}
	
	public void addMoney(int money) {
		if((accountBalance+money)<min_acc_bl) {
			System.out.println("You need to add minimum "+(min_acc_bl-accountBalance)+" to continue!");
		}
		else {
			accountBalance+= money;
		}
		System.out.println("The balance is: "+this.accountBalance);
	}
	public void removeMoney(int money) {
		if(money>withdraw_limit && accountBalance<money) {
			System.out.println("You can remove only "+withdraw_limit+" at max.");
		}
		else {
			this.accountBalance-= money;
		}
		System.out.println("The balance is: "+this.accountBalance);
	}
	public void checkBalance() {
		System.out.println("The balance is: "+this.accountBalance);
	}

}