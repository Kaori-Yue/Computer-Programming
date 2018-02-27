import java.util.Scanner;

public class GlassContainer1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		String name = sc.nextLine();
		String met = sc.nextLine();
		int num = sc.nextInt();
		Glass a = new Glass();
		a.id = id;
		a.name = name;
		a.meterial = met;
		a.setNumber(num);
		a.printDetail();
	}
}

class Glass {
	String id, name, meterial;
	private int num;

	public void setNumber(int num) {
		this.num = num;
	}

	public void printDetail() {
		System.out.printf("ID:%s\nName:%s\nMaterial:%s\nCount:%d\n", id, name, meterial, num);
	}
}