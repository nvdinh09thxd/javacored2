package baitap.BaiTap1.pk6;

public class Ex3 {

	public static void main(String[] args) {
		// Tính tổng các số chẵn từ 1 đến 10
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println("Tổng là : " + sum);
	}
}
