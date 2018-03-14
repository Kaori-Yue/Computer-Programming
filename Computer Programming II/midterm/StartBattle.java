import java.util.Scanner;

public class StartBattle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt(),
			C = scan.nextInt(),
			onHit = 0,
			missInMap = 0,
			wasHit = 0,
			missSame = 0,
			outFrame = 0;
		int Map[][] = new int[R][C];
		for (int i = 0; i < R; i++)
			for (int j = 0; j < C; j++)
				Map[i][j] = scan.nextInt();
		int K = scan.nextInt();

		for (int i = 0; i < K; i++) {
			int x = scan.nextInt() - 1,
				y = scan.nextInt() - 1;
				if (x >= 0 && x < R && y >= 0 && y < C) {
					if (Map[x][y] == 1) {
						onHit++;
						Map[x][y] = -1;
					} else if (Map[x][y] == 0) {
						missInMap++;
						Map[x][y] = 2;
					} else if (Map[x][y] == -1) {
						// -1 mean is battleship is was here but is sink currently
						wasHit++;
					} else if (Map[x][y] == 2) {
						// 2 mean is position was target
						missSame++;
					}
				} else {
					outFrame++;
				}
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d", onHit, missInMap, wasHit, missSame, outFrame);
	}
}