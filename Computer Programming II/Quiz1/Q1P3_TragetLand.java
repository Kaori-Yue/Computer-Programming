import java.util.Scanner;

public class Q1P3_TragetLand {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] cost = new int[n];
		for (int i = 0; i < n; i++)
			cost[i] = scan.nextInt();
		int q = scan.nextInt() - 1;
		for (int i = 0; i <= q; i++) {
			int k = scan.nextInt() / 2;
			int m = scan.nextInt();
			if (m - k >= 1 && m + k <= n) {
				int sum = 0;
				for(int j = m-k; j <= m+k; j++)
					sum += cost[j - 1];
				System.out.println(sum);
			} else {
				System.out.println("no");
			}
		}
	}
}