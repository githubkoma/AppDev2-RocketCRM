package de.rfh.rocketcrm.entity;

import java.sql.*;
import de.rfh.rocketcrm.entity.DataSource;

public class H2DataSource implements DataSource {

	public String dbURL = "jdbc:h2:tcp://localhost/C:/git/AppDev2-RocketCRM/src/dbFolder/RocketCRM";	
	public String driver = "org.h2.Driver";
	public String user = "sa";
	public String pwd = "";
	
	private Connection myConnection;
	
	public Connection getConnection() throws Exception {
		//Connection myConnection = null;
		
		//try {
			Class.forName(driver);
			myConnection = DriverManager.getConnection(dbURL, user, pwd);
		//} catch (ClassNotFoundException e) {
		//	// TODO Auto-generated catch block
		//	e.printStackTrace();
		//} catch (SQLException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		
		return myConnection;
	}
	
	public void doDisConnect() 
	{	
		try
		{
			this.myConnection.close();
			
		} catch (SQLException e)
			{
				e.printStackTrace();
			}
	}
}