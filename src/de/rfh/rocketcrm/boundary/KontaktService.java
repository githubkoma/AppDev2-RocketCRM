package de.rfh.rocketcrm.boundary;

import java.util.ArrayList;
import java.util.List;

import de.rfh.rocketcrm.entity.Kontakt;;

public interface KontaktService {
	
	// Every Method throws an Exception back to the Client if needed,
	// to let the Error Message Printing happen there
	List<Kontakt> getKontakte() throws Exception;
	Kontakt getKontakt(Kontakt k) throws Exception;
	
	Kontakt createKontakt(Kontakt k) throws Exception;
	Kontakt deleteKontakt(Kontakt k) throws Exception;
	Kontakt editKontakt(Kontakt k) throws Exception;
	
}