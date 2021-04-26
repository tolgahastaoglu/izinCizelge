package izinCizelge;

public class Main {

	public static void main(String[] args) {
		Personel personel1= new Personel(1,"Erkek",20,5);
	
		
		Personel personel2= new Personel();
		personel2.id=2;
		personel2.cinsiyet="Kadýn";
		personel2.izinGunSayisi=15;
		personel2.departmanId=5;
		
		Personel personel3= new Personel();
		personel3.id=3;
		personel3.cinsiyet="Erkek";
		personel3.izinGunSayisi=12;
		personel3.departmanId=1;
		
		Personel[] personels= {personel1,personel2,personel3};
		
		for (Personel personel : personels) {
		System.out.println(personel.cinsiyet);	
		
		Departman departman1=new Departman(5,"IT");
		Departman departman2=new Departman(1,"DS");
		Departman departman3=new Departman(2,"Tech");
		
		Departman[] departmans= {departman1,departman2,departman3};
		for (Departman departman : departmans) {
			System.out.println(departman.departmanAdi);
		}
		
		Izinler izinler=new Izinler();
		izinler.izin(personel3);
		}
		
		
	
		
		
		
	}
		
}
