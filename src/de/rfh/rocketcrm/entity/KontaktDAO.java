package de.rfh.rocketcrm.entity;

import java.util.ArrayList;
import java.util.List;

public interface KontaktDAO {

	List<Kontakt> kontaktarray = new ArrayList<Kontakt>();
	List<Kontakt> getKontakte();
	
	Kontakt getKontakt(Kontakt c);
	Kontakt createKontakt(Kontakt c);
	Kontakt deleteKontakt(Kontakt c);
	
}