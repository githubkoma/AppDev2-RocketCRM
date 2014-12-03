package de.rfh.rocketcrm.boundary;

import de.rfh.rocketcrm.entity.Kontakt;;

public interface KontaktService {

	//Kontakt[] Kontakte = new Kontakt[+1];
	
	Kontakt getKontakte();
	Kontakt getKontakt(Kontakt k);
	Kontakt createKontakt(Kontakt k);
	Kontakt deleteKontakt(Kontakt k);
	
}