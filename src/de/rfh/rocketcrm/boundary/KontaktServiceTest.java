package de.rfh.rocketcrm.boundary;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import de.rfh.rocketcrm.entity.Kontakt;
import de.rfh.rocketcrm.entity.KontaktDAO;

public class KontaktServiceTest {
	
	// ErrorHandle oErrorHandler = new ErrorHandle();
	
	public static void main(String[] args) {
		KontaktServiceTest ks = new KontaktServiceTest();
		Kontakt k = new Kontakt();
		
		try {
			//RMI test
			ks.sayHello();			
			
			//Test Alle Anzeigen
			ks.ZeigeAlleKontakte();
			
			//Test ein Kontakt Anzeigen
			k.setcId(6);
			ks.ZeigeEinenKontakt(k);
			
			//Test Kontakt erstellen
			k = new Kontakt();
			k.setcId(26);
			k.setcNName("NachnameTest");
			k.setcVName("VornameTest");
			k.setcCompany("FirmaTest");
			k.setcVersion(1);
			ks.ErstelleKontakt(k);
			
			//Test Kontakt löschen
			k = new Kontakt();
			k.setcId(26);
			k = ks.ZeigeEinenKontakt(k);
			ks.LoescheKontakt(k);
			
			//Terst Kontakt ändern
			k = new Kontakt();
			k.setcId(10);
			k = ks.ZeigeEinenKontakt(k);
			k.setcNName("AndererNachname");
			k.setcVName("AndererVorname");
			ks.EditiereKontakt(k);
		} catch (MalformedURLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

	private void ZeigeAlleKontakte() throws Exception {
		//KontaktDAO service = (KontaktDAO) Naming.lookup ("rmi://localhost:1099/KontaktDAO");
		//KontaktService service = new KontaktServiceImplementation();
	
		List<Kontakt> kontaktarray = new ArrayList<Kontakt>();
	
		KontaktDAO service = (KontaktDAO) Naming.lookup ("rmi://localhost:1099/KontaktDAO");
		
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
		
	private Kontakt ZeigeEinenKontakt(Kontakt k) throws Exception {
		//KontaktService service = new KontaktServiceImplementation();
		KontaktDAO service = (KontaktDAO) Naming.lookup ("rmi://localhost:1099/KontaktDAO");
		
		k = service.getKontakt(k);

		System.out.println("ID: " + k.getcId());
		System.out.println("Nachname: " + k.getcNName());
		System.out.println("Vorname: " + k.getcVName());
		// Restliche Felder ausgeben	
		return k;
		
	}
	
	private void ErstelleKontakt(Kontakt k) throws Exception {
		//KontaktService service = new KontaktServiceImplementation();
		KontaktDAO service = (KontaktDAO) Naming.lookup ("rmi://localhost:1099/KontaktDAO");
		
		k = service.createKontakt(k);
		
		System.out.println("Kontakt erstellt: ");
		System.out.println("ID: " + k.getcId());
		System.out.println("Nachname: " + k.getcNName());
		System.out.println("Vorname: " + k.getcVName());

	}
	
	private void LoescheKontakt(Kontakt k) throws Exception {
		//KontaktService service = new KontaktServiceImplementation();
		KontaktDAO service = (KontaktDAO) Naming.lookup ("rmi://localhost:1099/KontaktDAO");
		
		k = service.deleteKontakt(k);
		
		System.out.println("Kontakt gelöscht");
		
	}
	
	private void EditiereKontakt(Kontakt k) throws Exception{
		//KontaktService service = new KontaktServiceImplementation();
		KontaktDAO service = (KontaktDAO) Naming.lookup ("rmi://localhost:1099/KontaktDAO");
		
		k = service.editKontakt(k);
		
		System.out.println("Kontakt geändert");
		
	}
	
	private void sayHello() throws Exception
	{
		KontaktDAO service = (KontaktDAO) Naming.lookup ("rmi://localhost:1099/KontaktDAO");
		String msg = service.sayHello("Hello Server !?");
			
		System.out.println(msg);
	}
}
