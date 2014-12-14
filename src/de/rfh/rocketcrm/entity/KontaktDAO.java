package de.rfh.rocketcrm.entity;

import java.util.ArrayList;
import java.util.List;

public interface KontaktDAO {
	
	List<Kontakt> getKontakte() throws Exception;
	Kontakt getKontakt(Kontakt c) throws Exception;
	
	Kontakt createKontakt(Kontakt c) throws Exception;
	Kontakt deleteKontakt(Kontakt c) throws Exception;
	Kontakt editKontakt(Kontakt c) throws Exception;
	
}