import java.util.Scanner;
import java.util.regex.Pattern;

class CharReplacement1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		String options[] = scan.nextLine().split(" ");
		System.out.println(message.replaceFirst(Pattern.quote(options[0]), options[1]));
	}
}