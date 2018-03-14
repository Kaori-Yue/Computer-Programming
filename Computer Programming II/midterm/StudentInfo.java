import java.util.Scanner;
import java.util.ArrayList;

public class StudentInfo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int N = scan.nextInt();
		ArrayList<Student> students = new ArrayList<Student>();
		for(int i = 0; i < N; ++i) {
			students.add(new Student(scan.next(), scan.next(), scan.next()));
		}
		final int K = scan.nextInt();
		//
		for (int i = 0; i < K; i++) {
			int command = scan.nextInt();
			String txt = scan.next();
			boolean isNone = true;
			if (command == 1) {
				// id
				for (int j = 0; j < N; j++) {
					if (students.get(j).id.equals(txt)) {
						System.out.printf("%s %s %s\n", students.get(j).id, students.get(j).firstName, students.get(j).lastName);
						isNone = false;
					}
				}
			} else if (command == 2) {
				// firstName
				for (int j = 0; j < N; j++) {
					if (students.get(j).firstName.equals(txt)) {
						System.out.printf("%s %s %s\n", students.get(j).id, students.get(j).firstName, students.get(j).lastName);
						isNone = false;
					}
				}
			} else {
				// lastName
				for (int j = 0; j < N; j++) {
					if (students.get(j).lastName.equals(txt)) {
						System.out.printf("%s %s %s\n", students.get(j).id, students.get(j).firstName, students.get(j).lastName);
						isNone = false;
					}
				}
			}
			if (isNone)
				System.out.println("none");
		}
	}
}

class Student {
	String id;
	String firstName;
	String lastName;

	Student(String id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	void printLineInfo() {
		System.out.println(id + " " + firstName + " " + lastName);
	}
}