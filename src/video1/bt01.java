package video1;

import java.util.Scanner;

public class bt01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten cua ban ");
		String name = sc.nextLine();
		System.out.println("Nhap tuoi cua ban ");
		int age = sc.nextInt();
		System.out.println("ban ten la " + name + " ban hien nay " + age + " tuoi");

	}
}
