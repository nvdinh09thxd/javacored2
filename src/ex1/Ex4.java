package ex1;

public class Ex4 {
	public static void main(String[] args) {
		// cách khai báo hằng số trong java
		// Hằng số là không được thay đổi
		// bất biến trong chương trình.
		// nên viết hoa đối với hằng số
		// CHUNG_MINH_NHAN_DAN
		final String EMAIL = "phut@vinaenter.com";
		final float PI = 3.14f;
		System.out.println("EMAIL: " + EMAIL);
		System.out.println("PI: " + PI);
		// Ctrl + D: xóa 1 dòng
		// Ctrl + Shift + f : Định dạng code cho đẹp
		int a = 11;
		a--;
		System.out.println(a);
		int b = 0;
		System.out.println(a == b);
		System.out.println(a != b);
		boolean hihi = false;
		System.out.println(!hihi);
	}
}
