package com.kodecamp.students;

public class Student implements IStudent{
	
	
	private String id;
	private String name;
	private String address;
	private String course;
	
	public Student(final String id,final String name,final String address,final String course){
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.course = course;
		
	}
	

	@Override
	public String getId() {
		System.out.println("Id of student "+id);
		return id;
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public String getAddress() {
	
		return address;
	}

	@Override
	public String getCourse() {
	
		return course;
	}

}
