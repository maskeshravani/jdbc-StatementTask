package com.examples;

import java.sql.SQLException;

public class Smain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StateEX s = new StateEX();
		//s.insertdemo();
		//s.updateData();
		//s.deleteData();
		s.fetchData();
	}

}
