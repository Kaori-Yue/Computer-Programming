import java.util.Scanner;

public class BattleMap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt();
		int C = scan.nextInt();
		int Map[][] = new int[R][C];
		for (int i = 0; i < R; i++)
			for (int j = 0; j < C; j++)
				Map[i][j] = scan.nextInt();
		int K = scan.nextInt();

		// output
		System.out.println(K);
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++)
				System.out.print(Map[i][j] + " ");
			System.out.println();
		}
	}
}