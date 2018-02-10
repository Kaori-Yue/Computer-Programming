import java.util.Scanner;

class Q2P4_CharCount2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[] count = new int[26];
		int lines = 0;
			while (true) {
				String message = scan.next();
				lines++;
				for (int i = 0; i < message.length(); i++) {
					count[((int)message.charAt(i)) - 65]++;
					if (count[((int)message.charAt(i)) - 65] >= length) {
						System.out.println(message.charAt(i) + "\n" + lines);
						return;
					}
				}
			}
	}
}