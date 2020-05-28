package baitap;

import java.util.Random;
import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		int soLanDoan = 0;
		int soLanDoanDung = 0;

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String tieptuc;
		int tongDiem = 0;
		do {
			int n;
			do {
				System.out.print("Vui lòng nhập vào một số từ 0 đến 5: ");
				n = Integer.parseInt(sc.nextLine());
			} while (n < 0 || n > 5);
			int number = rd.nextInt(5);
			System.out.println("Số máy tạo ra: " + number);
			if (n == number) {
				tongDiem += 2;
				soLanDoanDung++;
			}
			soLanDoan++;
			System.out.print("Bạn có muốn tiếp tục không? (Y/N)?:  ");
			tieptuc = sc.nextLine();
		} while ("y".equalsIgnoreCase(tieptuc));
		sc.close();
		System.out.println("Tổng điểm: " + tongDiem);
		System.out.println("Số lần đoán: " + soLanDoan);
		System.out.println("Số lần đoán đúng: " + soLanDoanDung);
		System.out.println("Tỷ lệ đoán đúng: " + (int) Math.round((float) soLanDoanDung / soLanDoan * 100) + "%");
	}
}
