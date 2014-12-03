package de.rfh.rocketcrm.control;
import java.util.ArrayList;
import java.util.List;

import de.rfh.rocketcrm.boundary.KontaktService;
import de.rfh.rocketcrm.entity.*;

public class KontaktServiceImplementation implements KontaktService {

	private KontaktDAO dao;	
	
	public KontaktServiceImplementation() {
		this.dao = KontaktDAOFactory.getKontakteDAO();
	}
	
	public List<Kontakt> getKontakte() {
		
		List<Kontakt> kontaktarray = new ArrayList<Kontakt>();
		return kontaktarray = dao.getKontakte();
	}

	public Kontakt getKontakt(Kontakt k) {
		return k = dao.getKontakt(k);
	}

	public Kontakt createKontakt(Kontakt k) {
		// TODO Auto-generated method stub
		return null;
	}

	public Kontakt deleteKontakt(Kontakt k) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
