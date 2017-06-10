package com.kodecamp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.kodecamp.students.IStudent;
import com.kodecamp.students.Student;

public class DBConnection implements IDBConnection {

	static

	private DBConnection dbConnection;

	public DBConnection() {

	}

	@Override
	public void insertStudentRecord(String query) {

		try {
			Class.forName("org.h2.Driver");
			Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/testdb", "testdb", "testdb");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			con.close();

		} catch (ClassNotFoundException notFound) {
			System.out.println("Driver class not found.");
			notFound.printStackTrace();

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

	@Override
	public IStudent getStudentRecord(String query) {
		
		System.out.println("getStudentRecord : executed");
		
		IStudent student = null;

		try {
			Class.forName("org.h2.Driver");
			Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/testdb", "testdb", "testdb");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			

			while (rs.next()) {

				student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));

			}

			con.close();

		} catch (ClassNotFoundException notFound) {
			System.out.println("Class not found");

		} catch (Exception exception) {
				exception.printStackTrace();
		}

		return student;
	}

	@Override
	public ArrayList getTableData(String query) {
		
		ArrayList<IStudent> studentList = new ArrayList<IStudent>();
		IStudent student = null;
		try{
			
			Class.forName("org.h2.Driver");
			Connection  con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/testdb", "testdb", "testdb");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()){
				
				student = new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				studentList.add(student);
			}
			con.close();
			
		}
		catch(ClassNotFoundException notFound){
			System.out.println(notFound);
			notFound.printStackTrace();
		}catch(Exception exception){
			exception.printStackTrace();
		}

		return studentList;
	}

}
