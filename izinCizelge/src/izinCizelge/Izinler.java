package izinCizelge;

public class Izinler {
	public void izin(Personel personel) {
		
		
		if (personel.departmanId==5) {
			System.out.println("IT personeline izin verilmez"); 
		}else {
			System.out.println(personel.id + " nolu personele izin verilmiþtir"); 
		}
		
	}
}
