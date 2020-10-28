package app;

public class Bank {
	int balance ;
	
	public Bank(int am) {
		this.balance=am;
	}
	
	public int getBalance() {
		
		
		return balance;
		
	}
	public void deposite(int amount) {
		balance=balance+amount;
		System.out.println("Deposit :"+balance);
		
	}
	public void withdrow(int takeOutMoney) {
		balance=balance-takeOutMoney;
		System.out.println("Widrow :"+balance);
	}

}
