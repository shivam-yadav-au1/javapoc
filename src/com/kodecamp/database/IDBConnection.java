package com.kodecamp.database;

import java.util.ArrayList;

import com.kodecamp.students.IStudent;

public interface IDBConnection {
	
	public void insertStudentRecord(final String query);
	public IStudent getStudentRecord(final String query);
	public ArrayList getTableData(final String query);
	
	

}
