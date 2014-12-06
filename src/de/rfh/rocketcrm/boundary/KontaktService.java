package de.rfh.rocketcrm.boundary;

import java.util.ArrayList;
import java.util.List;

import de.rfh.rocketcrm.entity.Kontakt;;

public interface KontaktService {
	// ALLGEMEINE R‹CKGABESTRUKTUR, per generischer ArrayList<?>:
	// Index [0] = Enth‰lt Return-Code, siehe ErrIDs
	// Index [1] = Enth‰lt Ergebnis-Objekt, gem‰ﬂ jeweiligem Aufruf
	
	List<?> getKontakte();
	List<?> getKontakt(Kontakt k);
	
	Kontakt createKontakt(Kontakt k);
	Kontakt deleteKontakt(Kontakt k);
	
}