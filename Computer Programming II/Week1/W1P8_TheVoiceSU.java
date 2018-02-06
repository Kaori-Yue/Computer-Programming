import java.util.Scanner;

public class W1P8_TheVoiceSU {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int judge_M = 0, judge_F = 0;
		for (int i = 1; i <= n; i++) {
			int sex = scan.nextInt();
			int PM = scan.nextInt();
			int PF = scan.nextInt();
			if (PM >= 9 && sex == 1 && judge_M < k) {
				judge_M++;
				System.out.println(i + " 1");
			} else if (PF >= 9 && sex == 2 && judge_F < k) {
				judge_F++;
				System.out.println(i + " 2");
			} else if (PM >= 9 && judge_M < k) {
				judge_M++;
				System.out.println(i + " 1");
			} else if (PF >= 9 && judge_F < k) {
				judge_F++;
				System.out.println(i + " 2");
			}
		}
	}
}