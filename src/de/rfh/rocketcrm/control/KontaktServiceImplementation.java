package de.rfh.rocketcrm.control;

import de.rfh.rocketcrm.boundary.KontaktService;
import de.rfh.rocketcrm.entity.*;

public class KontaktServiceImplementation implements KontaktService {

	private KontaktDAO dao;	
	
	public KontaktServiceImplementation() {
		this.dao = KontaktDAOFactory.getKontakteDAO();
	}
	
	public Kontakt getKontakte() {
		
		Kontakt k = new Kontakt();		
		return k = dao.getKontakte();
	}

	public Kontakt getKontakt(Kontakt c) {
		// TODO Auto-generated method stub
		return null;
	}

	public Kontakt createKontakt(Kontakt c) {
		// TODO Auto-generated method stub
		return null;
	}

	public Kontakt deleteKontakt(Kontakt c) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
