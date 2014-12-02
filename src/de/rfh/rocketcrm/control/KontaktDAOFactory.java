package de.rfh.rocketcrm.control;

import de.rfh.rocketcrm.entity.*;

public class KontaktDAOFactory {

	public static KontaktDAO getKontakteDAO() {
		return new KontaktDAO2db();
		// return new KontaktDAO2File();
	}
	
}