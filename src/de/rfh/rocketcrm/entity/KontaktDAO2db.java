package de.rfh.rocketcrm.entity;

import java.sql.*;
import de.rfh.rocketcrm.entity.*;

public class KontaktDAO2db implements KontaktDAO {

	private DataSource myDataSource = new H2DataSource();
	
	public Kontakt getKontakte() {

		Kontakt k = new Kontakt();
		
		Connection myConnection = myDataSource.getConnection();
			try {
				String sql = "SELECT * FROM Kontakt WHERE CID = 10";

				PreparedStatement myStatement = myConnection.prepareStatement(sql);
				ResultSet myResultSet = myStatement.executeQuery();
				
				while (myResultSet.next()) {
				
					k.setcId(myResultSet.getLong("CID"));
					k.setcNName(myResultSet.getString("CNNAME"));
					k.setcVName(myResultSet.getString("CVNAME"));
				
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return k;
		}		
		
	public Kontakt getKontakt(Kontakt c) {
		// TODO Auto-generated method stub
		return null;
	}

	public Kontakt createKontakt(Kontakt c) {
		// TODO Auto-generated method stub
		return null;
	}

	public Kontakt deleteKontakt(Kontakt c) {
		// TODO Auto-generated method stub
		return null;
	}

}
