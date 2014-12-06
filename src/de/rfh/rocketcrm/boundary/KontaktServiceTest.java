package de.rfh.rocketcrm.boundary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import de.rfh.rocketcrm.control.KontaktServiceImplementation;
import de.rfh.rocketcrm.entity.ErrorHandle;
import de.rfh.rocketcrm.entity.ErrorIDs;
import de.rfh.rocketcrm.entity.Kontakt;

public class KontaktServiceTest {
	
	ErrorHandle oErrorHandler = new ErrorHandle();
	
	public static void main(String[] args) {
			
		KontaktServiceTest ks = new KontaktServiceTest();
		
		ks.ZeigeAlleKontakte();
		
		//Kontakt k = new Kontakt();
		//k.setcId(88);
		//ks.ZeigeEinenKontakt(k);
	}

	private void ZeigeAlleKontakte() {
		KontaktService service = new KontaktServiceImplementation();

		List result = service.getKontakte();
		
		if ((int) result.get(0) == ErrorIDs.cOK) {
	
			List<Kontakt> kontaktarray = new ArrayList<Kontakt>();
			kontaktarray = (List<Kontakt>) result.get(1);
			
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

		} else {
			// ERROR ausgeben
		}
		
	}
		
	private void ZeigeEinenKontakt(Kontakt k) {
		KontaktService service = new KontaktServiceImplementation();
				
		List result = service.getKontakt(k);
		
		if ((int) result.get(0) == ErrorIDs.cOK) {
		
			k = (Kontakt) result.get(1);
			
			System.out.println(k.getcId());
			System.out.println(k.getcNName());
			System.out.println(k.getcVName());
			// Restliche Felder ausgeben
		
		} else {
			// ERROR ausgeben
			System.out.println(oErrorHandler.getErrorMessage((int) result.get(0)));
		}
		
	}
	
}
