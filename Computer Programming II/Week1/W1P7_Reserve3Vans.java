import java.util.Scanner;

public class W1P7_Reserve3Vans {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int car[] = new int[3];
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			int day = scan.nextInt();
			if (car[0] <= car[1] && car[0] <= car[2]) {
				System.out.println("A");
				car[0] += day;
			} else if (car[1] <= car[2]) {
				System.out.println("B");
				car[1] += day;
			} else {
				System.out.println("C");
				car[2] += day;
			}
		}
	}
}