import java.util.ArrayList;
import java.util.Scanner;

public class Reg {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int N = scan.nextInt();
		ArrayList<Student2> students = new ArrayList<Student2>();
		for(int i = 0; i < N; ++i) {
			students.add(new Student2(scan.next(), scan.next(), scan.next()));
		}
		final int S = scan.nextInt();
		int[] credits = new int[301];
		for(int i = 0; i < S; ++i) {
			int subj = scan.nextInt();
			credits[subj] = scan.nextInt();
		}
		final int K = scan.nextInt();
		//
		for (int i = 0; i < K; i++) {
			int T = scan.nextInt();
			String ID = scan.next();
			int SUBJ = scan.nextInt();
			// check exist
			if (credits[SUBJ] == 0)
				continue;
			// boolean contains = IntStream.of(credits).anyMatch(x -> x == SUBJ);
			// if (!contains)
			// 	return;
			int student = -1;
			for (int j = 0; j < N; j++) {
				if (students.get(j).id.equals(ID)) {
					student = j;
					break;
				}
			}
			if (student == -1)
				continue;
			if (T == 1) {
				// add
				if (!students.get(student).subjects[SUBJ]) {
					students.get(student).subjects[SUBJ] = true;
					students.get(student).credit += credits[SUBJ];
				}
			} else {
				// remove
				if (students.get(student).subjects[SUBJ]) {
					students.get(student).subjects[SUBJ] = false;
					students.get(student).credit -= credits[SUBJ];
				}
			}
		}
		for(int i = 0; i < N; ++i) {
			students.get(i).printRegInfo();
		}
	}
}

class Student2 {
	String id;
	String firstName;
	String lastName;
	boolean[] subjects = new boolean[301];
	int credit = 0;
	Student2(String id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	void printRegInfo() {
		System.out.println(id + " " + firstName + " " + lastName);
		System.out.println(credit);
		if(credit > 0) {
			for(int i = 1; i <= 300; ++i) {
				if(subjects[i])
					System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
