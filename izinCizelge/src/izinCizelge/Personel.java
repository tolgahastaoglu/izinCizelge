package izinCizelge;

public class Personel {
	
	public Personel() {
		System.out.println("�lk Cons");
	};
	public Personel(int id, String cinsiyet, int izinGunSayisi, int departmanId) {
		this();
		this.id=id;
		this.cinsiyet=cinsiyet;
		this.izinGunSayisi=izinGunSayisi;
		this.departmanId=departmanId;
	};
	

	int id;
	String cinsiyet;
	int izinGunSayisi;
	int departmanId;
}

