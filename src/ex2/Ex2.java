package ex2;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		// Tạo đối tượng scanner
		Scanner input = new Scanner(System.in);
		// Nhập họ tên, tuổi => in ra
		System.out.println("Vui lòng nhập họ tên: ");
		String hoTen = input.nextLine();
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Vui lòng nhập tuổi: ");
		// Cách 1:
		/*
		 * int tuoi = input.nextInt(); 
		 * input.nextLine(); Cách này dài code mà không đúng ý nghĩa
		 */
		// Cách 2:
		int tuoi = Integer.parseInt(input.nextLine());
		System.out.println("Tuổi: " + tuoi);
		// Nhập vào địa chỉ và lớp học
		System.out.println("Nhập địa chỉ: ");
		String diaChi = input.nextLine();
		System.out.println("Địa chỉ: " + diaChi);
		System.out.println("Nhập lớp học: ");
		String lopHoc = input.nextLine();
		System.out.println("Lớp học: " + lopHoc);
	}
}
