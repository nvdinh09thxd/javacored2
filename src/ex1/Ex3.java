package ex1;

public class Ex3 {
	// ép kiểu dữ liệu trong java
	// lớn -> nhỏ
	public static void main(String[] args) {
		double number1 = 19.5d;
		System.out.println("Number trước khi ép kiểu từ lớn sang nhỏ:" + number1);
		// Sau khi ép kiểu
		number1 = (int) number1;
		System.out.println("Number sau khi ép kiểu từ lớn sang nhỏ:" + number1);
	}
}
