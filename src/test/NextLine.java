package test;

import java.util.Scanner;

public class NextLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value for str1");

		String str1 = sc.nextLine();

		System.out.println("str1 is " + str1);

		System.out.println("Enter value for str2");

		String str2 = sc.nextLine();

		System.out.println("str2 is " + str2);

		sc.close();
	}
}
