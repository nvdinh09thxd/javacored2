package test;

import java.util.Scanner;

public class TroiLenh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a = ");
		int a = sc.nextInt();
		System.out.println(a);
		System.out.println("b = ");
		String b = sc.nextLine();
		System.out.println(b);
		sc.close();
	}
}