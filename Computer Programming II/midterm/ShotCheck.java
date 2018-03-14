import java.util.Scanner;

public class ShotCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt(),
			C = scan.nextInt(),
			K = scan.nextInt(),
			inFrame = 0,
			outFrame = 0;
		for (int i = 0; i < K; i++) {
			int x = scan.nextInt(),
				y = scan.nextInt();
			if (x >= 1 && x <= R && y >= 1 && y <= C)
				inFrame++;
			else
				outFrame++;
		}
		System.out.printf("%d\n%d", inFrame, outFrame);
	}
}