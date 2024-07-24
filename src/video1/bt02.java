package video1;

import java.util.Scanner;

public class bt02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chieu dai hcn: ");
		int dai = sc.nextInt();
		System.out.println("Chieu rong hcn: ");
		int rong = sc.nextInt();
		int c = (dai + rong) * 2;
		int s = dai * rong;
		System.out.println("Chu vi cua hcn la: " + c);
		System.out.println("Dien tich cua hcn la: " + s);
		System.out.println("Canh lon nhat cua hcn la : " + Math.max(dai, rong));

	}
}
