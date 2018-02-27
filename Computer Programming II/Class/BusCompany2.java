import java.util.Scanner;

public class BusCompany2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id = scan.next();
		int type = scan.nextInt();
		int seats = scan.nextInt();
		Bus b = new Bus(id, type, seats);

		int N = scan.nextInt();
		for(int i = 0; i < N; ++i) {
			int P = scan.nextInt();
			int K = scan.nextInt();
			if(P == 1)
				b.reserve(K);
			else if(P == 2)
				b.sendToRepair();
			else if(P == 3)
				b.backToService();
			b.printStats();
		}
	}
}

class Bus {
	String id, type;
	boolean isActive = true;
	int seats, booked = 0;

	public Bus(String id, int type, int seats) {
		this.id = id;
		this.seats = seats;
		if (type == 1) 
			this.type = "Fan";
		else if (type == 2)
			this.type = "P1";
		else
			this.type = "VIP";
	}

	void printStats() {
		System.out.printf("%s\n%s\n%d %d\n%s\n", this.id, this.type, this.booked, this.seats, this.isActive ? "Active" : "Inactive");
	}

	boolean reserve(int k) {
		if (k >= 1 && k <= this.seats - this.booked && this.isActive) {
			this.booked += k;
			return true;
		} else {
			return false;
		}
	}

	void sendToRepair() {
		this.isActive = false;
	}

	void backToService() {
		this.isActive = true;
	}
}