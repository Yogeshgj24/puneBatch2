package com;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.ArrayList;


public class MyConnetion {
	
	public void insertData() {
		try {
			
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Driver myDriver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(myDriver);
			String url = "jdbc:mysql://localhost:3306/sakila";
			String UserName = "root";
			String Password = "root";			
			Connection con = DriverManager.getConnection(url, UserName, Password);
			Statement statement = con.createStatement();
			
			String insertQuery = "INSERT INTO `sakila`.`city` (`city_id`, `city`, `country_id`, `last_update`) VALUES ('618', 'Vashi', '94', '2024-12-19 14:46:17'); ";
			statement.executeUpdate(insertQuery);
			System.out.println("Data succesfuly inserted.");
			con.close();
			
			
		}catch(Exception e) {		}
	}
	
	public void updateDate() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver myDriver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(myDriver);
			String url = "jdbc:mysql://localhost:3306/sakila";
			String UserName = "root";
			String Password = "root";			
			Connection con = DriverManager.getConnection(url, UserName, Password);
			Statement statement = con.createStatement();
			
			String updateQuery = "UPDATE `sakila`.`city` SET `city` = 'Amravati' WHERE (`city_id` = '617');";

			
			statement.executeUpdate(updateQuery);
			System.out.println("Data succesfuly updated.");
			con.close();
			
		}catch(Exception e) {}
	}
	
	public void deleteData() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver myDriver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(myDriver);
			String url = "jdbc:mysql://localhost:3306/sakila";
			String UserName = "root";
			String Password = "root";			
			Connection con = DriverManager.getConnection(url, UserName, Password);
			Statement statement = con.createStatement();
			
			String deleteQuery = "delete from city where city_id = 610;";
			statement.executeUpdate(deleteQuery);
			
			System.out.println("Data succesfuly deleted.");
			con.close();
			
			
		}catch(Exception e) {}
	}
	
	public void retriveData() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver myDriver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(myDriver);
			String url = "jdbc:mysql://localhost:3306/sakila";
			String UserName = "root";
			String Password = "root";			
			Connection con = DriverManager.getConnection(url, UserName, Password);
			Statement statement = con.createStatement();
			
			String retriveData = "Select * from city;";
			ResultSet resultSet =   statement.executeQuery(retriveData);
			
			String cityName="";
			
			ArrayList<String>  cityList = new ArrayList<String>();
			
			while(resultSet.next()) {
				
				//cityList.add(resultSet.getString("city")) ;
				//System.out.println("city="+resultSet.getString("city") + "....." +"Cityid="+resultSet.getInt("city_id") +"..."+"CountryId="+resultSet.getInt("country_id") );
				System.out.println("last_update="+resultSet.getString("last_update"));
			}
			
			
			System.out.println("cityList="+cityList.get(10)  );
			//extractCity(cityList);
		}catch(Exception e) {}
	}
	
	public void extractCity( ArrayList cityName) {
		System.out.println("--------"+cityName.toString());
	}

	public static void main(String[] args) {
		MyConnetion m = new MyConnetion();
		//m.insertData();
		//m.updateDate();
		//m.deleteData();
		m.retriveData();

	}

}
