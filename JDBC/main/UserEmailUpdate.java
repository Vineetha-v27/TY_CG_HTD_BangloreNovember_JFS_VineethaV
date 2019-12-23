package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		//load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded....");

			//get the db connection
			String dbUrl = "jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("Enter DB user and Password");
			String user = sc.nextLine();
			String password = sc.nextLine();
			conn = DriverManager.getConnection(dbUrl,user,password);
			System.out.println("connection established...");

			//issue the sql queries
			String query = "update users_info set email = ? "
					+ "where userid = ? and password = ?";
			pstmt = conn.prepareStatement(query);

			System.out.println("enter userid...");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("enter the new email...");
			pstmt.setString(1, sc.nextLine());
			System.out.println("enter the password to update..");
			pstmt.setString(3, sc.nextLine());

			int count = pstmt.executeUpdate();
			System.out.println("query issued..");

			//process the results returned by the sql queries
			if(count > 0) {
				System.out.println("Query OK,"+ count + "Rows affected");
			}else {
				System.err.println("something went wrong....");
			}
			sc.close();

		} catch (Exception e) {
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
			
			
		}
	}

}
