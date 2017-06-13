package com.kodecamp.database;

import com.kodecamp.students.IStudent;

public class LazyStudent implements IStudent{
	
	private IDBConnection connection;
	private int id;
	
	public LazyStudent(final int id,final IDBConnection connection){

		this.id = id;
		this.connection = connection;
	}

	@Override
	public int getId() {
		
		return id;
	}

	@Override
	public String getName() {
		
		String query = "Select name from students where id = "+this.id;
		return connection.getData(query);
	}

	@Override
	public String getAddress() {
	
		String query = "Select address from students where id = "+this.id;
		return connection.getData(query);
	}

	@Override
	public String getCourse() {
	
		String query = "Select course from students where id = "+this.id;
		return connection.getData(query);
	}

}
