package oops.abstraction;

public class BankUser {

	public static void main(String[] args) 
	{
		RBI acc; //reference is of RBI
		
		acc= new Citi();
		acc.creditCard();
		acc.debitCard();
		acc.currentAccount();
		acc.savingAccount();
		
		acc= new Pnb();
		acc.creditCard();
		acc.debitCard();
		acc.currentAccount();
		acc.savingAccount();
		
		acc= new BOI();
		acc.creditCard();
		acc.debitCard();
		acc.currentAccount();
		acc.savingAccount();



	}

}
