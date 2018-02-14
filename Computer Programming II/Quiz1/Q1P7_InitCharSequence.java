import java.util.Scanner;

public class Q1P7_InitCharSequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		String result = "" + message.charAt(0); // avoid error => String != char
		for (int i = 0; i < message.length(); i++) {
		    boolean isSequence = true;
		    for(int j = 0; j < result.length(); j++) {
		        if (message.charAt(i) == result.charAt(j))
		            isSequence = false;
		    }
		    if (isSequence)
		        result += message.charAt(i); // or use String.concat
		}
		System.out.println(result);
	}
}