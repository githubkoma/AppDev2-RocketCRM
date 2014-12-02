package de.rfh.rocketcrm.boundary;

import de.rfh.rocketcrm.entity.Kontakt;;

public interface KontaktService {

	//Kontakt[] Kontakte = new Kontakt[+1];
	
	Kontakt getKontakte();
	Kontakt getKontakt(Kontakt c);
	Kontakt createKontakt(Kontakt c);
	Kontakt deleteKontakt(Kontakt c);
	
}