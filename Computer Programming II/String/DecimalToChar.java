import java.util.Scanner;

class DecimalToChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int loop = scan.nextInt();
		for (int i = 0; i < loop; i++) {
			System.out.println(String.format("%c", scan.nextInt()));
		}
	}
}