import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ElectionVote {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String options[] = scan.nextLine().split(" ");
		ArrayList<Integer> people = new ArrayList<Integer>(Collections.nCopies(Integer.parseInt(options[0]), 0));
		for (int i = 0; i < Integer.parseInt(options[1]); i++) {
			int vote = scan.nextInt();
			people.set(vote - 1, people.get(vote - 1) + 1);
		}
		for (int i = 0; i < people.size(); i++) {
			System.out.println(i + 1 + " " + people.get(i));
		}
	}
}