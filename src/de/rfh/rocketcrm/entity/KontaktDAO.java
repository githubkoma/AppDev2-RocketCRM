package de.rfh.rocketcrm.entity;

import java.util.ArrayList;
import java.util.List;

public interface KontaktDAO {
	
	List<Kontakt> getKontakte();
	Kontakt getKontakt(Kontakt c) throws Exception;
	
	Kontakt createKontakt(Kontakt c);
	Kontakt deleteKontakt(Kontakt c);
	
}