package baitap;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào tháng trong năm: ");
		int month = Integer.parseInt(sc.nextLine());
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tháng này có 31 ngày!");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tháng này có 30 ngày!");
			break;
		case 2:
			System.out.print("Nhập vào năm: ");
			int year = Integer.parseInt(sc.nextLine());
			if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
				System.out.println("Tháng này có 29 ngày");
			} else {
				System.out.println("Tháng này có 28 ngày");
			}
			break;
		default:
			System.out.println("Tháng không hợp lệ!");
		}

		sc.close();
	}
}