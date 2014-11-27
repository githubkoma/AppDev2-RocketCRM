package de.rfh.rocketcrm.boundary;

import de.rfh.rocketcrm.entity.Kontakt;;

public interface KontaktService {

	Kontakt getKontakte();
	Kontakt getKontakt(Long cId, String cVName, String cNName);
	Kontakt createKontakt(Kontakt c);
	Kontakt deleteKontakt(Kontakt c);
	
}
