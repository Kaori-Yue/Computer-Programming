import java.util.Scanner;

class W3P10_StringCut {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		String result[] = message.split("" + scan.nextLine().charAt(0));
		if (result.length == 0) {
			System.out.println("no output");
			return;
		}
		if (result.length == 1) {
			System.out.println("no target character found");
			return;
		}
		for (String element : result) {
			if (!element.equals(""))
			System.out.println(element);
		}
	}
}