package baitap.BaiTap7.pk1;

public class FacebookAcountDemo {
	public static void main(String[] args) {
		FacebookAcount fbAn = new FacebookAcount();
		fbAn.hoTen = "Tráº§n VÄƒn An";
		fbAn.tuoi = 20;
		fbAn.email = "an@vinaenter.edu.vn";
		fbAn.setTrangThaiKetHon(false);

		System.out.println("Há»� tÃªn : " + fbAn.hoTen);
		System.out.println("Tuá»•i : " + fbAn.tuoi);
		System.out.println("Email: " + fbAn.email);
		System.out.println("Tráº¡ng thÃ¡i káº¿t hÃ´n: " + fbAn.getTrangThaiKetHon());
	
		fbAn.like();
		fbAn.like();
		
		System.out.println(fbAn.comment("Cáº£ tháº¿ giá»›i bá»•ng thu bÃ© láº¡i vá»«a báº±ng má»™t gáº¥u yÃªu!"));
		FacebookAcount fbHung = new FacebookAcount();
	}
}
