package baitap;

public class Bai6 {

	public static void main(String[] args) {
		final int HEIGHT = 5;
		String result = "";
		String space;
		String character;
		int line = 1;
		while (line <= HEIGHT) {
			space = "";
			character = "";
			for (int s = 1; s <= HEIGHT - line; s++)
				space += " ";
			for (int c = 1; c <= 2 * line - 1; c++)
				character += "*";

			result += space + character + "\n";
			line++;
		}
		System.out.println(result);
	}
}
