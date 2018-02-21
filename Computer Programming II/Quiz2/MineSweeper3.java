import java.util.Scanner;

public class MineSweeper3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt(),
			y = scan.nextInt();
		int arr[][] = new int[x][y];
		for (int i = 0; i < x; i++)
			for (int j = 0; j < y; j++)
				arr[i][j] = scan.nextInt();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (arr[i][j] == 1)
					System.out.print("* ");
				else
					System.out.print(Calc(arr, i + 1, j + 1) + " ");
			}
			System.out.println();
		}
	}
	private static int Calc(int[][] arr, int x_focus, int y_focus) {
		int minX = x_focus - 2 >= 0 ? x_focus - 2 : x_focus - 1,
			maxX = x_focus >= arr.length ? x_focus - 1 : x_focus,
			minY = y_focus - 2 >= 0 ? y_focus - 2 : y_focus - 1,
			maxY = y_focus >= arr[0].length ? y_focus - 1 : y_focus,
			count = 0;
		for (int i = minX; i <= maxX; i++) {
			for (int j = minY; j <= maxY; j++) {
				if (i == x_focus - 1 && j == y_focus - 1)
					continue;
				if (arr[i][j] == 1)
					count++;
			}
		}
		return count;
	}
}