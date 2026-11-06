package basic;

import java.util.*;
public class Met {


	/**
	 * method  is block code or collection  of statement group together to perform 
	 * a certain task  or operation  and return  to the result  to the caller  if application 
	 * 
	 */
	static int  balance=1000;
	public  void greetcustomer() {
		System.out.println("WELCOME TO BANKING APPLICATION ");
	}
	public void withdraw(int amount) {
		if (amount<=balance) {
			balance=balance-amount;
			System.out.println( "withdraw balance : "+balance);
		}
		else {
			System.out.println("No Balance");

		}

	}
	public void check() {
		System.out.println("check balance "+balance);
	}
	public void deposit(int amount) {
		balance=amount +balance;
		System.out.println("deposite balance : "+balance);
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		Met m=new Met();
		m.greetcustomer();


		m.deposit(1000);
		m.check();
		m.withdraw(500);
		m.withdraw(1500);
		m.check();
		m.withdraw(1500);
		

		

		




	}

}
