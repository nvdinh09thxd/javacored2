package baitap.BaiTap7.pk1;

public class FacebookAcount {
// properties
	public String hoTen;
	public int tuoi;
	protected String email;
	private boolean trangThaiKetHon;

// method đặc biệt: khởi tạo | constructor, là phương thức tự động chạy khi
// chúng ta khởi tạo đối tượng
	public FacebookAcount() {
		System.out.println("Đây là phương thức khởi tạo!");
	}
	
	
// method
	public String writeStatus(String status) {
		return status;
	}
	
	public void like() {
		System.out.println("Tôi thích bạn");
	}

	public String comment(String str) {
		return str;
	}
	
	//gán giá trị cho trangthaikethon
	public void setTrangThaiKetHon(boolean ttkh) {
		trangThaiKetHon = ttkh;
	}
	
	//lấy giá trị của trangthaikethon
	public boolean getTrangThaiKetHon() {
		return trangThaiKetHon;
	}
}
