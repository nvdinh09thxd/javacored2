package baitap.BaiTap7.pk3;

public class FacebookAcountDemo {

	public static void main(String[] args) {
		FacebookAcount fbAn = new FacebookAcount("Trần Văn An", 20, "an@vinaenter.edu.vn", false);
		System.out.println(fbAn.toString());
		
		FacebookAcount fbThuy = new FacebookAcount("Nguyễn Thị Cẩm Thủy", 18, "thuy@gmail.com", false);
		System.out.println(fbThuy.toString());
	}

}