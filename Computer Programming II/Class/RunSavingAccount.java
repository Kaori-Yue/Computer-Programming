import java.util.Scanner;

public class RunSavingAccount {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		String s,s1,s2;
		SavingAccount a = new SavingAccount("0-000-000","");
		for (int i=0;i<n;i++){
			s = x.next();
			if (s.equalsIgnoreCase("A")){
				s1 = x.next();
				s2 = x.next();
				a = new SavingAccount(s1,s2);
			}
			if (s.equalsIgnoreCase("C")){
				s1 = x.next();
				a.changeName(s1);
			}
			if (s.equalsIgnoreCase("D")){
				s1 = x.next();
				a.deposit(Double.parseDouble(s1));
			}
			if (s.equalsIgnoreCase("W")){
				s1 = x.next();
				a.withdraw(Double.parseDouble(s1));
			}
			if (s.equalsIgnoreCase("P")){
				a.display();
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
	public void changeName(String name) {
		this.accountName = name;
	}
	public void deposit(double amount) {
		this.amount += amount;
	}
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
