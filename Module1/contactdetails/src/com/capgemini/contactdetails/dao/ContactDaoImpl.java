package com.capgemini.contactdetails.dao;



import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.contactdetails.bean.ContactBean;

public class ContactDaoImpl implements ContactDao{
	FileReader reader;
	Properties prop;
	private ContactBean contact;
	public ContactDaoImpl() {
		try {
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName("com.mysql.jdbc.Driver");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public List<ContactBean> getAllContacts() {
		List<ContactBean> list = new ArrayList<ContactBean>();
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				contact = new ContactBean();
				contact.setCname(rs.getString(1));
				contact.setCnumber(rs.getInt(2));
				contact.setCgroup(rs.getString(3));
				list.add(contact);
			}
			return list;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean addContact(ContactBean bean) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertQuery"))){
			pstmt.setString(1,contact.getCname());
			pstmt.setInt(2, contact.getCnumber());
			pstmt.setString(3, contact.getCgroup());
		
			int count = pstmt.executeUpdate();
			
			if(count > 0) {
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	
		
	}

	@Override
	public boolean deleteContact(int cnumber) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteQuery"))){
			pstmt.setInt(2, cnumber);
			
			int count = pstmt.executeUpdate();
			
			if(count>0) {
				return true;
			}else
				return false;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean modifyContact(String cname,int cnumber,String cgroup) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("modifyQuery"))){
			pstmt.setString(1, cname);
			pstmt.setInt(2, cnumber);
			pstmt.setString(3, cgroup);

			int count = pstmt.executeUpdate();
			
			if(count>0) {
				return true;
			}else
				return false;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	
}
