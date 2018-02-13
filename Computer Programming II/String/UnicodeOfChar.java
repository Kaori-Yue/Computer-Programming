import java.util.Scanner;

class UnicodeOfChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		for (int i = 0; i < message.length(); i++) {
			System.out.println(message.charAt(i) + " \\u" + Integer.parseInt(String.format("%h", message.charAt(i)), 16));
		}
	}
}