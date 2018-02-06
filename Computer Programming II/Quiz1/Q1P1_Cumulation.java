import java.util.Scanner;

public class Q1P1_Cumulation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr_size = scan.nextInt() - 1;
		int lines = scan.nextInt();
		int arr[] = new int[arr_size];
		for (int i = 0; i < lines; i++) {
			int start = scan.nextInt() - 1;
			int end = scan.nextInt() - 1;
			int value = scan.nextInt();
			for(int j = start; j<= end; j++) {
				arr[j] += value;
			}
			for (int element : arr) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
}