package baitap.BaiTap1.pk6;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// Nhập vào số n
		// Tính tổng các số từ 0 đến n
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n = ");
		int n = Integer.parseInt(sc.nextLine());
		sc.close();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("Tổng là : " + sum);
	}

}
