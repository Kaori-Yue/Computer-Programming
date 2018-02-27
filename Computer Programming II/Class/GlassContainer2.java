import java.util.Scanner;

public class GlassContainer2 {
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
		int cnt = sc.nextInt();
		int n;
		for(int i=0;i<cnt;i++){
			n = sc.nextInt();
			a.sale(n);
		}
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

	public void sale(int n) {
		if (num - n >= 0) {
			this.num -= n;
			System.out.printf("Left:%d\n", this.num);
		} else {
			System.out.printf("Not enough\n");
		}
	}
}