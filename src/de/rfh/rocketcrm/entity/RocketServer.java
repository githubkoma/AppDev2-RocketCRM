package de.rfh.rocketcrm.entity;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import de.rfh.rocketcrm.control.KontaktServiceImplementation;

public class RocketServer 
{
	public static void main(String[] args) throws Exception
	{
		LocateRegistry.createRegistry(1099);
		KontaktServiceImplementation impl = new KontaktServiceImplementation();
		Naming.bind("rmi://localhost:1099/KontaktDAO", impl);
		
		System.out.println("Server running!");	
		
		//FileToHash Daten im Speicher halten
		DataSource myDataSource = new FileDataSource();
		myDataSource.getConnection();
		
		//HashQueue als eigener Thread
		HashQueue hq = new HashQueue();		
		try {
			hq.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit( 0 );
		}
	}	
}