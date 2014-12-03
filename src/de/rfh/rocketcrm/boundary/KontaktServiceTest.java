package de.rfh.rocketcrm.boundary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import de.rfh.rocketcrm.control.KontaktServiceImplementation;
import de.rfh.rocketcrm.entity.Kontakt;

public class KontaktServiceTest {

	public static void main(String[] args) {
		KontaktServiceTest ks = new KontaktServiceTest();
		
		ks.ZeigeAlleKontakte();
		
		//Kontakt k = new Kontakt();
		//k.setcId(6);
		//ks.ZeigeEinenKontakt(k);
	}

	private void ZeigeAlleKontakte() {
		KontaktService service = new KontaktServiceImplementation();
				
		List<Kontakt> kontaktarray = new ArrayList<Kontakt>(); 	
		kontaktarray = service.getKontakte();

		Kontakt k = new Kontakt();
		String xAusgabe = ""; 
		Iterator<Kontakt> iterator = kontaktarray.iterator();
		while (iterator.hasNext()) {
			
			k = iterator.next();
			
			xAusgabe = Objects.toString(k.getcId());
			xAusgabe += " ; ";
			xAusgabe += k.getcNName();
			xAusgabe += " ; ";
			xAusgabe += k.getcVName();
			// TODO: Restliche Felder ausgeben
			
			System.out.println(xAusgabe);			
			
		}

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
