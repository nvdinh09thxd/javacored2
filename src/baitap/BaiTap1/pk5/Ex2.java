package baitap.BaiTap1.pk5;

import java.util.Scanner;

public class Ex2 {
public static void main(String[] args) {
	// Nhập vào một số từ 2 đến 8
	// Nếu nhập 2, 4, 6, 8: in ra thứ chẵn
	// Nếu nhập 3, 5, 7: in ra thứ lẻ
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhập vào một số: ");
	int number = Integer.parseInt(sc.nextLine());
	sc.close();
	switch(number) {
		case 2:
		case 4:
		case 6:
		case 8: System.out.print("Hôm nay là thứ chẵn!");
		break;
		case 3:
		case 5:
		case 7: System.out.print("Hôm nay là thứ lẻ!");
		break;
		default: System.out.println("Vui lòng nhập số từ 2 đến 8!");
	}
}
}
