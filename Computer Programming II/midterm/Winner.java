import java.util.Scanner;

public class Winner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt(),
			C = scan.nextInt(),
			onHit = 0,
			missInMap = 0,
			wasHit = 0,
			missSame = 0,
			outFrame = 0,
			onHitTurnLast = 0,
			onHitTurnFirst = -1,
			countBattleShip = 0;
		boolean isFirst = true;
		int Map[][] = new int[R][C];
		for (int i = 0; i < R; i++)
			for (int j = 0; j < C; j++) {
				Map[i][j] = scan.nextInt();
				if (Map[i][j] == 1)
					countBattleShip++;
			}
		int K = scan.nextInt();

		for (int i = 0; i < K; i++) {
			int x = scan.nextInt() - 1,
				y = scan.nextInt() - 1;
				if (x >= 0 && x < R && y >= 0 && y < C) {
					if (Map[x][y] == 1) {
						onHit++;
						Map[x][y] = -1;
						onHitTurnLast = i + 1;
						if (isFirst) {
							isFirst = false;
							onHitTurnFirst = i + 1;
						}
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
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%s", onHit, missInMap, wasHit, missSame, outFrame, onHit == countBattleShip ? "attacker " + onHitTurnLast : "battleship " + onHitTurnFirst);
	}
}