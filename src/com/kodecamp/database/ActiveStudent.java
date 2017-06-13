package com.kodecamp.database;

import com.kodecamp.students.IStudent;

public class ActiveStudent implements IStudent {

	private IStudent student;
	private String name;
	private String address;
	private String course;

	public ActiveStudent(final IStudent student) {

		this.student = student;

	}

	@Override
	public int getId() {

		return student.getId();
	}

	@Override
	public String getName() {

		name = name == null ? student.getName() : name;
		return name;
		
	}

	@Override
	public String getAddress() {
		
		address = address == null ? student.getAddress() : address;
		return address;
	}

	@Override
	public String getCourse() {
		
		course = course == null ? student.getCourse() : course;
		return course;
	}

}
