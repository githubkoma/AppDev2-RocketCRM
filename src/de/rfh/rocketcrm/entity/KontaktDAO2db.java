package de.rfh.rocketcrm.entity;

import java.sql.*;
import java.util.List;

import de.rfh.rocketcrm.entity.*;

public class KontaktDAO2db implements KontaktDAO {

	private DataSource myDataSource = new H2DataSource();
	
	public List<Kontakt> getKontakte() {

		Connection myConnection = myDataSource.getConnection();
			try {
				String sql = "SELECT * FROM Kontakt";

				PreparedStatement myStatement = myConnection.prepareStatement(sql);
				ResultSet myResultSet = myStatement.executeQuery();
				
				// Normales Array ist NICHT dynamisch, daher ArrayList
				//for(int i = 0; i < kontaktarray.length; i++){
					
				int i = 0;
				while (myResultSet.next()) {
					
					kontaktarray.add(new Kontakt());
					
					kontaktarray.get(i).setcId(myResultSet.getLong("CID"));
					kontaktarray.get(i).setcNName(myResultSet.getString("CNNAME"));
					kontaktarray.get(i).setcVName(myResultSet.getString("CVNAME"));		
					
					i++;
					
					}	
				
			}  catch (SQLException e) {
				e.printStackTrace();
		}			
			
		return kontaktarray;
	}		
		
	public Kontakt getKontakt(Kontakt k) {
				
		Connection myConnection = myDataSource.getConnection();
			try {
				String sql = "SELECT * FROM Kontakt WHERE CID = ?";

				PreparedStatement myStatement = myConnection.prepareStatement(sql);
				myStatement.setLong(1, k.getcId());
								
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

	public Kontakt createKontakt(Kontakt k) {
		// TODO Auto-generated method stub
		return null;
	}

	public Kontakt deleteKontakt(Kontakt k) {
		// TODO Auto-generated method stub
		return null;
	}

}
