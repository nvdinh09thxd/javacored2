package baitap;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào n = ");
		int n = Integer.parseInt(sc.nextLine());
		sc.close();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.print("Tổng các số từ 1 đến " + n + " là: " + sum);
	}
}