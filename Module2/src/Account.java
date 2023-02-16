//import java.util.Date;
/*
 * The account holder attribute will link to the Client class that you created in problem 6.

Your constructor and overloaded constructor should set the date created to the current date.

Your deposit method should add to the balance

Your withdrawal method should remove from the balance, as long as there is enough money to withdrawal
 */

public class Account {
	
	private Client AccountHolder;
	private Double Balance;
	private java.util.Date DateCreated;

public Account(){
		
}

public Account(Client AccountHolder, Double Balance){
//	DateCreated = new java.util.Date();
}

public Client getAccountHolder() {
	return AccountHolder;
}

public void setAccountHolder(Client accountHolder) {
	AccountHolder = accountHolder;
}

public Double getBalance() {
	return Balance;
}

public Double deposit() {//not sure
	return Balance;
}

public Double Withdrawal(Double Balance) {//NotSure
	return Balance;
}


public java.util.Date getDateCreated() {
	return DateCreated;
}

@Override
public String toString() {
	return "Account [AccountHolder=" + AccountHolder + ", Balance=" + Balance + ", DateCreated=" + DateCreated + "]";
}



}
