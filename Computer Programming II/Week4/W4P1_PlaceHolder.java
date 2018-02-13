import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class W4P1_PlaceHolder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		Pattern pattern = Pattern.compile("0.0(.{4})0.0");
		Matcher matcher = pattern.matcher(message);
		if (matcher.find())
		  System.out.println(matcher.group(1));
		
	}
}