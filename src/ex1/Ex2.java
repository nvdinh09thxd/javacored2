package ex1;

public class Ex2 {
	// main:
	public static void main(String[] args) {
		// Khai bao thong tin cua 1 ban hoc vien
		System.out.println(">> Thông tin học viên <<");
		String hoTen = "Phan Thị Diễm";
		int tuoi = 17;
		float canNang = 47.6f;
		char nhomMau = 'O';
		// false : nu, true : nam
		boolean gioiTinh = false;
		/*
		 * dấu +: nối chuỗi, in biến \n : xuống dòng (new line) \t : tương ứng nút tab
		 * \": " \': '
		 */
		System.out.print("\"Họ tên\" : " + hoTen + "\n");
		System.out.print("Tuổi: " + tuoi + "\t\t");
		System.out.println("\'Cân nặng:\' " + canNang);
		System.out.println("Nhóm máu: " + nhomMau);
		System.out.println("Giới tính: " + gioiTinh);
	}
}
