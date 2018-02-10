import java.util.Scanner;

class Q2P1_CharCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if (number >= (int)'A' && number <= (int)'Z')
			System.out.println((char)number);
		else
			System.out.println("unsupported code");
	}
}