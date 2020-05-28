package baitap;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào dãy 3 số nguyên: ");
		String str = sc.nextLine();
		sc.close();
		String[] arrStr = str.split("\\s+");
		int min = Integer.parseInt(arrStr[0]);
		for (int i = 1; i < arrStr.length; i++) {
			int n = Integer.parseInt(arrStr[i]);
			if (n < min)
				min = n;
		}
		System.out.println("Số nhỏ nhất là : " + min);
	}
}