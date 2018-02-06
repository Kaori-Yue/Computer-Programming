import java.util.Scanner;

public class Q1P5_Labor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] cost = new int[n];
		int[] labor = new int[n];
		for (int i = 0; i < n; i++)
			cost[i] = scan.nextInt();
		for (int i = 0; i < n; i++)
			labor[i] = scan.nextInt();
		int q = scan.nextInt() - 1;
		for (int i = 0; i <= q; i++) {
			int k = scan.nextInt() / 2;
			int m = scan.nextInt();
			if (m - k >= 1 && m + k <= n) {
				int sum = 0;
				boolean isLabor = true;
				for (int j = m-k; j <= m+k; j++) {
					sum += cost[j - 1];
					if (labor[j - 1] < 5)
						isLabor = false;
				}
				System.out.print(sum);
				System.out.println(isLabor ? " labor" : "");
			} else {
				int sum = 0;
				int start = m - k >= 1 ? m - k : 1;
				int end = m + k <= n ? m + k : n;
				for (int j = start; j <= end; j++)
					sum += cost[j - 1];
				System.out.println("no " + sum);
			}
		}
	}
}