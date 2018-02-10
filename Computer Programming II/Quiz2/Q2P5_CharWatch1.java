import java.util.Scanner;

class Q2P5_CharWatch1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String _focus = scan.nextLine();
		String[] focus = _focus.split(" ");
		String message = scan.nextLine();
		
		int _numberOfWatch = scan.nextInt();
		int[] numberOfWatch = new int[_numberOfWatch];
		for (int i = 0; i < _numberOfWatch; i++)
			numberOfWatch[i] = scan.nextInt() - 1;
		//
		int[] result = Calc(message, numberOfWatch, focus);
		for (int element : result)
			System.out.println(element);
	}

	public static int[] Calc(String message, int[] watcher, String[] focus) {
		int focus1 = 0, focus2 = 0, focus3 = 0, outRange = 0;
			for (int watch : watcher) {
				if (watch >= message.length() || watch < 0) {
					outRange++;
					continue;
				}
				if (message.charAt(watch) == focus[0].charAt(0))
					focus1++;
				if (message.charAt(watch) == focus[1].charAt(0))
					focus2++;
				if (message.charAt(watch) == focus[2].charAt(0))
					focus3++;
			}
		return new int[] {focus1, focus2, focus3, outRange};
	}
}