package de.rfh.rocketcrm.entity;

public class ErrorHandle {

	private String errorMessage;
	
	public String getErrorMessage(int i) {
		
		switch(i){
        case 0:
            errorMessage = "Kein Fehler - 0";
            break;
        case 1:
        	errorMessage = "Fehler - 1";
            break;
        
        // Weitere Fehlerf�lle definieren
        
        case 3:
        	errorMessage = "Fehler - 3 - RecordNotFound.";
        	break;
            
        // Weitere Fehlerf�lle definieren
        	
        default:
        	errorMessage = "Allgemeiner Fehler - X";
        }		
		
		return errorMessage;		
		
	}
	
}
