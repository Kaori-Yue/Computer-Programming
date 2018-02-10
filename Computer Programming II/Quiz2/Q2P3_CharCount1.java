import java.util.Scanner;

class Q2P3_CharCount1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = scan.next();
		int[] count = new int[26];
		for (int i = 0; i < message.length(); i++) {
			count[((int)message.charAt(i)) - 65]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0)
				System.out.println((char)(i + 65) + " " + count[i]);
		}
	}
}