package de.rfh.rocketcrm.boundary;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import de.rfh.rocketcrm.control.KontaktServiceImplementation;
import de.rfh.rocketcrm.entity.ErrorHandle;
import de.rfh.rocketcrm.entity.ErrorIDs;
import de.rfh.rocketcrm.entity.Kontakt;

public class KontaktServiceTest {
	
	// ErrorHandle oErrorHandler = new ErrorHandle();
	
	public static void main(String[] args) {
			
		KontaktServiceTest ks = new KontaktServiceTest();
		
		// ks.ZeigeAlleKontakte();
		
		Kontakt k = new Kontakt();
		k.setcId(6);
		ks.ZeigeEinenKontakt(k); 
			
		//ks.ErstelleKontakt(k);
		
		//ks.LoescheKontakt(k);
		
		//ks.EditiereKontakt(k);
		
	}

	private void ZeigeAlleKontakte() {
	
		KontaktService service = new KontaktServiceImplementation();
	
		List<Kontakt> kontaktarray = new ArrayList<Kontakt>();

		try {		
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
		
		// Just Print Error that was being handled in KontaktServiceImplementation
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
		
	private void ZeigeEinenKontakt(Kontakt k) {
		KontaktService service = new KontaktServiceImplementation();
			
		try {	
			k = service.getKontakt(k);

			System.out.println("ID: " + k.getcId());
			System.out.println("Nachname: " + k.getcNName());
			System.out.println("Vorname: " + k.getcVName());
			// Restliche Felder ausgeben
		
		// Just Print Error that was being handled in KontaktServiceImplementation
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	private void ErstelleKontakt(Kontakt k){
		
	}
	
	private void LoescheKontakt(Kontakt k){
		
	}
	
	private void EditiereKontakt(Kontakt k){
		
	}
	
}
