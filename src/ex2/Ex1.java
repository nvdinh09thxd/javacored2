package ex2;

import java.util.Random;

public class Ex1 {
	public static void main(String[] args) {
		// Tạo số ngẫu nhiên từ 0 đến 20
		Random rd = new Random();
		int number1 = rd.nextInt(21);
		System.out.println("Số ngẫu nhiên: " + number1);

		// Tạo số ngẫu nhiên từ 10 - 20
		// random bắt đầu từ số 0
		int number2 = rd.nextInt(11) + 10;
		System.out.println("Số ngẫu nhiên thứ 2: " + number2);

		// tạo số ngẫu nhiên từ a -> b: rd.nextInt(b-a) + a;
	}
}
