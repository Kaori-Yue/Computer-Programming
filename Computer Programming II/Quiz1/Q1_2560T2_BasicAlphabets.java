import java.util.Scanner;
import java.util.ArrayList;

class Q1_2560T2_BasicAlphabets {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Character> result = new ArrayList<Character>();
		String message = scan.nextLine();
		for (int i = 0; i < message.length(); i++) {
			boolean isDuplicate = false;
			for (char element : result) {
				if (element == message.charAt(i)) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate)
				result.add(message.charAt(i));
		}
		for (char element : result)
			System.out.print(element);
	}
}