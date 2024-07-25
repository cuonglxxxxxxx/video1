package lab02;

import java.util.Scanner;

public class bt1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float y = 0;
		System.out.println("Nhap a:");
		int a = sc.nextInt();
		System.out.println("Nhap b:");
		int b = sc.nextInt();

		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vsn");
			} else {
				System.out.println("Phuong trinh vn");
			}
		} else {
			y = -b / a;

		}
		System.out.printf("Nghiem cua pt la %f ", y);
	}
}
