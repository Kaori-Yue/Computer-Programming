import java.util.Scanner;

class Q1_2560T2_CharReplacementAsRequest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder message = new StringBuilder(scan.nextLine());
		String options[] = scan.nextLine().split(" ");
		int count = 0;
		char isReplace[] = scan.nextLine().toCharArray();
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) == options[0].charAt(0) && isReplace[count++] == 'Y')
				message.setCharAt(i, options[1].charAt(0));
			if (count == isReplace.length)
				break;
		}
		System.out.println(message.toString());
	}
}