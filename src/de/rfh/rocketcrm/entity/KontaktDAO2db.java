package de.rfh.rocketcrm.entity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import de.rfh.rocketcrm.entity.*;

public class KontaktDAO2db implements KontaktDAO {
	
	private DataSource myDataSource = new H2DataSource();

	public List<Kontakt> getKontakte() {
		
		// Normales Array ist NICHT dynamisch erweiterbar, daher ArrayList
		List<Kontakt> kontaktarray = new ArrayList<Kontakt>();
	
		Connection myConnection = myDataSource.getConnection();
		if  (myConnection != null) 
		{
			try 
			{
				String sql = "SELECT * FROM Kontakt";

				PreparedStatement myStatement = myConnection.prepareStatement(sql);
				ResultSet myResultSet = myStatement.executeQuery();				
				
				int i = 0;
				while (myResultSet.next()) 
				{
					
					kontaktarray.add(new Kontakt());
					
					kontaktarray.get(i).setcId(myResultSet.getLong("CID"));
					kontaktarray.get(i).setcNName(myResultSet.getString("CNNAME"));
					kontaktarray.get(i).setcVName(myResultSet.getString("CVNAME"));
							
					i++;
					
				}	
					
			}  catch (SQLException e) {
											
				e.printStackTrace();

			}			
				
		}
		
		return kontaktarray;	
		
	}

		
	public Kontakt getKontakt(Kontakt k) throws Exception
	{
	
		Connection myConnection = myDataSource.getConnection();

		String sql = "SELECT * FROM Kontakt WHERE CID = ?";

		PreparedStatement myStatement = myConnection.prepareStatement(sql);
		myStatement.setLong(1, k.getcId());
						
		ResultSet myResultSet = myStatement.executeQuery();
		// myResultSet.beforeFirst();
		
		// Datensatz vorhanden?
		if (myResultSet.next()) {
		
			k.setcId(myResultSet.getLong("CID"));
			k.setcNName(myResultSet.getString("CNNAME"));
			k.setcVName(myResultSet.getString("CVNAME"));
		
		// Kein Datensatz vorhanden?
		} else {
			int errorID = ErrorIDs.cErrRecordNotFound;
			String errorIDstring = String.valueOf(errorID) ;
			throw new Exception(errorIDstring);					
		}				
		
		return k;
	}

	public Kontakt createKontakt(Kontakt k) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Kontakt deleteKontakt(Kontakt k) 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
