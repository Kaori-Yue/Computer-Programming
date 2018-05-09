import java.util.Scanner;
import java.util.ArrayList;

public class CreditUnion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<SavingAccount> accounts = new ArrayList<SavingAccount>(n);
		for (int i = 0; i < n; i++) {
			String msg[] = scan.nextLine().split(" ");
			if (msg[0].length() < 1) {
			  n++;
			  continue;
			}
			if (msg[0].equals("A")) {
				accounts.add(new SavingAccount(msg[1], msg[2]));
			} else if (msg[0].equals("C")) {
				for (SavingAccount account : accounts) {
					if (!msg[1].equals(account.getAccountNumber()))
						continue;
					account.changeName(msg[2]);
					break;
				}
			} else if (msg[0].equals("D")) {
				for (SavingAccount account : accounts) {
					if (!msg[1].equals(account.getAccountNumber()))
						continue;
					account.deposit(Double.parseDouble(msg[2]));
					break;
				}
			} else if (msg[0].equals("W")) {
				for (SavingAccount account : accounts) {
					if (!msg[1].equals(account.getAccountNumber()))
						continue;
					account.withdraw(Double.parseDouble(msg[2]));
					break;
				}
			} else {
				// P (Display)
				boolean isFound = false;
				for (SavingAccount account : accounts) {
					if (!msg[1].equals(account.getAccountNumber()))
						continue;
					account.display();
					isFound = true;
					break;
				}
				if (!isFound)
					System.out.println("ACCOUNT NUMBER " + msg[1] + " IS NOT FOUND.");
			}
		}
	}
}

class SavingAccount {
	public String accountNumber;
	private String accountName;
	private double amount;

	public SavingAccount(String numb, String name) {
		this.accountNumber = numb;
		this.accountName = name;
	}
	public String getAccountNumber() { return this.accountNumber; }
	public void changeName(String name) { this.accountName = name; }
	public void deposit(double amount) { this.amount += amount; }
	public void withdraw(double amount) {
		if (amount > this.amount)
			System.out.println("AMOUNT IN ACCOUNT $" + this.amount + ". PLEASE TRY AGAIN.");
		else
			this.amount -= amount; 
	}
	public void display() {
		System.out.println(String.format("ACCOUNT NUMBER:%s\nACCOUNT NAME:%s\nAMOUNT:$%.2f", this.accountNumber, this.accountName, this.amount));
	}
}