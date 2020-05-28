package baitap.BaiTap7.pk3;

public class FacebookAcount {
	private String hoTen;
	private int tuoi;
	private String email;
	private boolean trangThaiKetHon;

	public FacebookAcount() {

	}

	public FacebookAcount(String hoTen, int tuoi, String email, boolean trangThaiKetHon) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.email = email;
		this.trangThaiKetHon = trangThaiKetHon;
	}

	public String comment() {
		return null;
	}

	public void like() {

	}

	public void share() {

	}

	// gán giá trị - lấy giá trị các thuộc tính: setter - getter
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isTrangThaiKetHon() {
		return trangThaiKetHon;
	}

	public void setTrangThaiKetHon(boolean trangThaiKetHon) {
		this.trangThaiKetHon = trangThaiKetHon;
	}
	
	public String toString() {
		return "Họ tên: "+this.hoTen +"\nTuổi: "+this.tuoi+"\nEmail: "+this.email+"\nTrạng thái kết hôn: "+this.trangThaiKetHon;
	}
	
	
	public static void main(String[] args) {
		FacebookAcount fbAn = new FacebookAcount("Trần Văn An", 20, "an@vinaenter.edu.vn", false);
		System.out.println(fbAn.toString());
		
		FacebookAcount fbThuy = new FacebookAcount("Nguyễn Thị Cẩm Thủy", 18, "thuy@gmail.com", false);
		System.out.println(fbThuy.toString());
		
	}

}
