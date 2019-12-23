package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//load the driver 
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded..");
			
			//get the db connection via driver
			String dbUrl = "jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter username and password");
			String dbUser = sc.nextLine();
			String dbPass = sc.nextLine();
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			System.out.println("Connection established..");
			
			//issue the sql queries via connection
//			String query = "SELECT * FROM users_info "
//							+ "where userid = 2019001 AND password ='vini271' ";
			String query = "SELECT * FROM users_info "
				+ "where userid = ? AND password = ? ";
			pstmt = conn.prepareStatement(query);
			
			System.out.println("Enter userid..");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter Password...");
			pstmt.setString(2, sc.nextLine());
			
			rs = pstmt.executeQuery();
			
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(query);
			
			System.out.println("Query issued. and Executed....");
			//process the results returned by the sql queries
			if(rs.next()) {
				System.out.println("userid:" +rs.getInt(1));
				System.out.println("username:" +rs.getString(2));
				System.out.println("email:" +rs.getString("email"));
				}else {
					System.err.println("something went wrong");
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			//close all the jdbc objects
		finally {
			try {
					if(conn != null)
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if(rs != null) {
					rs.close();
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
