package app;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b=new Bank(100);
		
		b.deposite(500);
		
	    int  c=b.getBalance();
		System.out.println("get balance :"+c);
		
		b.withdrow(300);	
	}

} 
