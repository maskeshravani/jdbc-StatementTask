package com.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StateEX {
	// insert Data
	public void insertdemo() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Employee Id: ");
		int id = sc.nextInt();

		System.out.println("Enter the name: ");
		String name = sc.next();

		System.out.println("Enter department Id: ");
		int dId = sc.nextInt();

		String query = "insert into employees(emp_id,name,dept_id) values(" + id + ",'" + name + "'," + dId + ")";
		s.executeUpdate(query);
		System.out.println("Data is Inserted Succesfully....");

	}

	// Update Data
	public void updateData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name: ");
		String name = sc.next();

		System.out.println("Enter the Employee Id: ");
		int id = sc.nextInt();

		String query = "update employees set name= ' " + name + " '  where emp_id  = " + id + " ";
		s.executeUpdate(query);
		System.out.println("Data is Updated Succesfully....");
	}

	// Delete Data
	public void deleteData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Employee Id: ");
		int id = sc.nextInt();

		String query = "delete from employees  where emp_id  = " + id + " ";
		s.executeUpdate(query);
		System.out.println("Data is Deleted Succesfully....");
	}

	// Fetch Data
	public void fetchData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from employees");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID: ");
		int id = sc.nextInt();

		while (rs.next()) {

			System.out.println("id: " + rs.getInt("emp_id"));
			System.out.println("name: " + rs.getString("name"));
			System.out.println("Department Id: " + rs.getInt("dept_id"));


		}
	}
}
