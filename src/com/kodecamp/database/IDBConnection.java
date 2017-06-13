package com.kodecamp.database;

import java.util.ArrayList;

import com.kodecamp.students.IStudent;

public interface IDBConnection {
	
	public boolean insertStudentRecord(final String query);
	public IStudent getStudentRecord(final String query);
	public ArrayList getTableData(final String query);
	public String getData(final String query);
	
	

}
