package de.rfh.rocketcrm.entity;

public interface KontaktDAO {

	Kontakt getKontakte();
	Kontakt getKontakt(Kontakt c);
	Kontakt createKontakt(Kontakt c);
	Kontakt deleteKontakt(Kontakt c);
	
}