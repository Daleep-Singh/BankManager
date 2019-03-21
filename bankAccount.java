package MVC;

import java.util.Observable;


@SuppressWarnings("deprecation")
public class bankAccount extends Observable {
	private int balance = 0;
	
	public bankAccount(int balance) {
		this.balance = balance;
		
	}
	
	public bankAccount() {
		this(0);
	}
	
	public void deposit(int amount) {
		if (amount < 0) {
			return;
		}
		else {
			this.balance += amount;
			this.setChanged();
			this.notifyObservers("$" + amount + " was just deposited");
	}
	}
	public void withdraw(int amount) {
		if (amount > this.balance) {
			System.out.println("Insufficient Funds");
		}
		else {
			this.balance -= amount;
			this.setChanged();
			this.notifyObservers("$" + amount + " was just withdrawed");
	}
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public String toString() {
		return "You currently have$" + this.balance;
	}
	
}
