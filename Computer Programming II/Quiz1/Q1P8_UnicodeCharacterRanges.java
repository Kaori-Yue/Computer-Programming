import java.util.Scanner;

public class Q1P8_UnicodeCharacterRanges {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		String[] locate = message.split(",");
		for (String _element: locate) {
			int element = Integer.parseInt(_element, 16); // convert hex to decimal
			if (element >= Integer.parseInt("0020", 16) && element <= Integer.parseInt("007F", 16))
			    System.out.println("BASIC LATIN");
		    else if (element >= Integer.parseInt("0600", 16) && element <= Integer.parseInt("06FF", 16))
		        System.out.println("ARABIC");
		    else if (element >= Integer.parseInt("0E00", 16) && element <= Integer.parseInt("0E7F", 16))
		        System.out.println("THAI");
		    else if (element >= Integer.parseInt("0E80", 16) && element <= Integer.parseInt("0EFF", 16))
		        System.out.println("LAO");
		    else if (element >= Integer.parseInt("3040", 16) && element <= Integer.parseInt("309F", 16))
		        System.out.println("HIRAGANA");
		    else if (element >= Integer.parseInt("30A0", 16) && element <= Integer.parseInt("30FF", 16))
		        System.out.println("KATAKANA");
		    else
		        System.out.println("UNKNOWN");
		}
	}
}