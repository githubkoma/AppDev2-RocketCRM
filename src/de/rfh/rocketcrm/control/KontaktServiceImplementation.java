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
	
	public List<?> getKontakte() {
		return dao.getKontakte();
	}

	public List<?> getKontakt(Kontakt k) {
		return dao.getKontakt(k);
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
