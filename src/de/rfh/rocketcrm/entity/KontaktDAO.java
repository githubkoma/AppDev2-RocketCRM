package de.rfh.rocketcrm.entity;

import java.util.ArrayList;
import java.util.List;

public interface KontaktDAO {
	
	List<?> getKontakte();
	List<?> getKontakt(Kontakt c);
	
	Kontakt createKontakt(Kontakt c);
	Kontakt deleteKontakt(Kontakt c);
	
}