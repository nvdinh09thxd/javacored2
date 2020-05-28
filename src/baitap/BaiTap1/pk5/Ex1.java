package baitap.BaiTap1.pk5;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// Nhập vào một số từ 2-8. In ra thứ tương ứng
		//2: Thứ 2 - 3: Thứ 3...- 8: Chủ nhật
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập một số: ");
		int n = Integer.parseInt(sc.nextLine());
		sc.close();
		switch(n) {
			case 2: System.out.print("Hôm nay là thứ hai!");
			break;
			case 3: System.out.print("Hôm nay là thứ ba!");
			break;
			case 4: System.out.print("Hôm nay là thứ tư!");
			break;
			case 5: System.out.print("Hôm nay là thứ năm!");
			break;
			case 6: System.out.print("Hôm nay là thứ sáu!");
			break;
			case 7: System.out.print("Hôm nay là thứ bảy!");
			break;
			case 8: System.out.print("Hôm nay là chủ nhật!");
			break;
			default: System.out.print("Vui lòng nhập số từ 2 đến 8!");
			break;
		}
	}

}
