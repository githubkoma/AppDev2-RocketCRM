package de.rfh.rocketcrm.entity;

import java.sql.Connection;

public interface DataSource {

	Connection getConnection();
	void doDisConnect();
}
