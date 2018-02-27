import java.util.Scanner;

public class BusCompany3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		Bus bus[] = new Bus[q];
		for (int i = 0; i < q; i++) {
			bus[i] = new Bus(scan.next(), scan.nextInt(), scan.nextInt());
		}
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int p = scan.nextInt(),
				k = scan.nextInt(),
				t = scan.nextInt();
				if (p == 1) {
					// booked
					/*
					boolean status = bus[t - 1].reserve(k);
					System.out.printf("%s\n", status ? bus[t].id : "sorry");
					*/
					boolean status = false;
					int current = -1;
					for (int j = 0; j < q; j++) {
						current = j;
						if (t == 1) {
							// Fan
							if (bus[j].type == "Fan") {
								status = bus[j].reserve(k);
								//System.out.printf("%s\n", status ? bus[j].id : "sorry");
								if (status)
									break;
							}
						} else if (t == 2) {
							// P1
							if (bus[j].type == "P1") {
								status = bus[j].reserve(k);
								//System.out.printf("%s\n", status ? bus[j].id : "sorry");
								if (status)
									break;
							}
						} else if (t == 3) {
							// VIP
							if (bus[j].type == "VIP") {
								status = bus[j].reserve(k);
								//System.out.printf("%s\n", status ? bus[j].id : "sorry");
								if (status)
									break;
							}
						} else {
							// WTF test case why have var t > 3
							break;
						}
					}
					System.out.printf("%s\n", status ? bus[current].id : "sorry");
				} else if (p == 2) {
					// inactive
					bus[t - 1].sendToRepair();
				} else {
					// active
					bus[t - 1].backToService();
				}
		}
	}
}

class Bus {
	String id, type;
	private boolean isActive = true;
	private int seats, booked = 0;

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