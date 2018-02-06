import java.util.Scanner;

public class Q1P2_TrainTicket {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int station = scan.nextInt();
		int maxSeat = scan.nextInt();
		int book = scan.nextInt();
		int seat = maxSeat;
		// boolean[] isSeat = new boolean[seat]; // default is false // false = empty
		for (int i = 0; i < book; i++) {
			int x = scan.nextInt(); // up
			int y = scan.nextInt(); // down
			int z = scan.nextInt(); // want
			if (seat - z >= 0) {
				seat -= z;
			} else {
				System.out.println("N");
			}
		}
	}
}