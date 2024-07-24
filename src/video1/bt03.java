package video1;

import java.util.Scanner;

public class bt03 {
	public static void main(String[] args) {
		System.out.println("Nhap canh cua khoi lap phuong: ");
		Scanner sc = new Scanner(System.in);
		int dai = sc.nextInt();
		System.out.println("The tich cua khoi lap phuong la: " + Math.pow(dai, 3));

	}
}
