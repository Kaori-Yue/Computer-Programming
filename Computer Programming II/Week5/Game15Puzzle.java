// README
// THIS INCOMPLETE SOURCECODE
// 30/50 SCORE
import java.util.Scanner;
import java.util.Arrays;

public class Game15Puzzle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int map[][] = new int[4][4];
		int map_success[]  = new int[16];
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++) {
				int x = scan.nextInt();
				map[i][j] = x;
				map_success[(4 * i) + j] = x;
			}
		Arrays.sort(map_success); // index 0 is zero (empty)
		while (true) {
			int numberTarget = scan.nextInt();
			int direction = scan.nextInt();
			if (numberTarget == 0 && direction == 0) {
				System.out.println("exit game");
				return;
			}
			boolean isMoved = false;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (map[i][j] == numberTarget) {
						int tmp = map[i][j];
						if (direction == 8 && i - 1 >= 0 && i - 1 < 4 && map[i - 1][j] == 0) {
							// up
							map[i][j] = map[i - 1][j];
							map[i - 1][j] = tmp;
							isMoved = true;
							break;
						} else if (direction == 2 && i + 1 >= 0 && i + 1 < 4 && map[i + 1][j] == 0) {
							// down
							map[i][j] = map[i + 1][j];
							map[i + 1][j] = tmp;
							isMoved = true;
							break;
						} else if (direction == 4 && j - 1 >= 0 && j - 1 < 4 && map[i][j - 1] == 0) {
							// left
							map[i][j] = map[i][j - 1];
							map[i][j - 1] = tmp;
							isMoved = true;
							break;
						} else if (direction == 6 && j + 1 >= 0 && j + 1 < 4 && map[i][j + 1] == 0) {
							// right
							map[i][j] = map[i][j + 1];
							map[i][j + 1] = tmp;
							isMoved = true;
							break;
						}
					}
				}
				if (isMoved)
					break;
			}
			if (isMoved) {
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						System.out.print(map[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println();
			} else {
				System.out.println("you cannot move this number\n");
			}
			// check game success
			if (map[3][3] == 0) {
				boolean isSuccess = true;
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if (i == 3 && j == 3)
							continue;
						if (map[i][j] != map_success[(i * 4) + j + 1]) {
							System.out.println(String.format("%d %d  = %d : %d", i, j, i+j, (i*4)+j));
							isSuccess = false;
							break;
						}
					}
					if (!isSuccess)
						break;
				}
				if (isSuccess) {
					System.out.println("Congratulation!!!");
					return;
				}
			}
		}
	}
}