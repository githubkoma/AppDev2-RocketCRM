package de.rfh.rocketcrm.boundary;
import de.rfh.rocketcrm.control.KontaktServiceImplementation;
import de.rfh.rocketcrm.entity.Kontakt;

public class KontaktServiceTest {

	public static void main(String[] args) {
		KontaktServiceTest ks = new KontaktServiceTest();
		
		//ks.ZeigeAlleKontakte();
		
		Kontakt k = new Kontakt();
		k.setcId(5);
		ks.ZeigeEinenKontakt(k);
	}

	private void ZeigeAlleKontakte() {
		KontaktService service = new KontaktServiceImplementation();
		
		Kontakt k = new Kontakt();
		k = service.getKontakte();
		System.out.println(k.getcId());
		System.out.println(k.getcNName());
		System.out.println(k.getcVName());
		// Restliche Felder ausgeben
	}
		
	private void ZeigeEinenKontakt(Kontakt k) {
		KontaktService service = new KontaktServiceImplementation();
				
		k = service.getKontakt(k);
		System.out.println(k.getcId());
		System.out.println(k.getcNName());
		System.out.println(k.getcVName());
		// Restliche Felder ausgeben
	}
	
}
