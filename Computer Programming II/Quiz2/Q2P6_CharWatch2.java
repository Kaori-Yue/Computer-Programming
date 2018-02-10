import java.util.Scanner;

class Q2P6_CharWatch2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String _focus = scan.nextLine();
		String[] focus = _focus.split(" ");
		
		int numberOfMessage = scan.nextInt();
		String[] message = new String[numberOfMessage];
		for (int i = 0; i < numberOfMessage; i++)
			message[i] = scan.next();
			
		int _numberOfWatch = scan.nextInt();
		int[] numberOfWatch = new int[_numberOfWatch];
		for (int i = 0; i < _numberOfWatch; i++)
			numberOfWatch[i] = scan.nextInt() - 1;

		int[] result = Calc(message, numberOfWatch, focus);
		for (int element : result)
			System.out.println(element);
	}

	private static int[] Calc(String[] message, int[] watcher, String[] focus) {
		int focus1 = 0, focus2 = 0, focus3 = 0;
		for (String msg : message) {
			for (int watch : watcher) {
				if (watch >= msg.length() || watch < 0)
					continue;
				else if (msg.charAt(watch) == focus[0].charAt(0))
					focus1++;
				else if (msg.charAt(watch) == focus[1].charAt(0))
					focus2++;
				else if (msg.charAt(watch) == focus[2].charAt(0))
					focus3++;
			}
		}
		return new int[] { focus1, focus2, focus3 };
	}
}