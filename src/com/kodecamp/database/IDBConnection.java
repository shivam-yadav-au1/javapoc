package com.kodecamp.database;

public interface IDBConnection {
	
	public void insertData(final String query);
	public void getData(final String query);
	public boolean verifyData(final String query);

}
