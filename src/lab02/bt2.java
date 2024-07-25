package lab02;

import java.util.Scanner;

public class bt2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so dien cua ban:");
		int x = sc.nextInt();
		int tien = 0;
		if (x < 0) {
			System.out.println("Gia tri nhap vao phai lon hon 0:");

		} else if (x <= 100) {
			tien = x * 1000;
			System.out.printf("Tien dien cua quy khach la: %d", tien);
		} else {
			tien = 100 * 1000 + 1500 * (x - 100);
			System.out.printf("Tien dien cua quy khach la: %d", tien);
		}

		sc.close();
	}
}
