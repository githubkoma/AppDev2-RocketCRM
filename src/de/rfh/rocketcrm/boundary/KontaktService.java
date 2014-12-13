package de.rfh.rocketcrm.boundary;

import java.util.ArrayList;
import java.util.List;

import de.rfh.rocketcrm.entity.Kontakt;;

public interface KontaktService {
	
	List<Kontakt> getKontakte();
	Kontakt getKontakt(Kontakt k) throws Exception;
	
	Kontakt createKontakt(Kontakt k);
	Kontakt deleteKontakt(Kontakt k);
	
}