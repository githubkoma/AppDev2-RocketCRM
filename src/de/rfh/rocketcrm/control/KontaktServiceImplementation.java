package de.rfh.rocketcrm.control;
import java.sql.SQLException;
import java.util.List;

import de.rfh.rocketcrm.boundary.KontaktService;
import de.rfh.rocketcrm.entity.*;

public class KontaktServiceImplementation implements KontaktService {

	ErrorHandle oErrorHandler = new ErrorHandle();
	
	private KontaktDAO dao;	
	
	public KontaktServiceImplementation() {
		this.dao = KontaktDAOFactory.getKontakteDAO();
	}
	
	public List<Kontakt> getKontakte() {
		return dao.getKontakte();
	}

	public Kontakt getKontakt(Kontakt k) throws Exception {
		
		try {
		  k = dao.getKontakt(k);
		  
		} 	catch (SQLException e) {
			System.out.println("server - !!! SQLException !!!");
		}
			catch (Exception e) {
				
				// If Return-Value is Integer: Use our Handled Error-Messages, by errorID
			    try { 
			        int errorID = Integer.parseInt(e.getMessage());
			        String errorMessage = oErrorHandler.getErrorMessage(errorID);
			        System.out.println(errorMessage);
			        
			    // If not Integer, dont use our handled Errors -> Generic StackTrace Output    
			    } catch(NumberFormatException eNumb) {
			    	System.out.println("server - !!! Generic Exception !!!");
			    	e.printStackTrace(); 
			    }

			}
					
		return dao.getKontakt(k);
	}

	public Kontakt createKontakt(Kontakt k) {
		// TODO Auto-generated method stub
		return null;
	}

	public Kontakt deleteKontakt(Kontakt k) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
