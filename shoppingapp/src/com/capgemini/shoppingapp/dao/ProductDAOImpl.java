package com.capgemini.shoppingapp.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.capgemini.shopping.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO{
	Scanner sc = new Scanner(System.in);
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	FileReader reader;
	Properties prop;
	ProductBean bean;
	
	public ProductDAOImpl() {
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
	public List<ProductBean> showAllProducts(){
		List<ProductBean> list = new ArrayList<ProductBean>();
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query1"));){
			while(rs.next()) {
				bean = new ProductBean();
				bean.setProductid(rs.getInt(1));
				bean.setProductname(rs.getString(2));
				bean.setProductcost(rs.getDouble(3));
				bean.setProductcategory(rs.getString(4));
				bean.setDescription(rs.getString(5));
				bean.setNumberofproducts(rs.getInt(6));
				list.add(bean);
			}
			return list;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<ProductBean> searchProduct(String productname) {
		List<ProductBean> list = new ArrayList<ProductBean>();
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("searchQuery"));){
			pstmt.setString(1, productname);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ProductBean bean1 = new ProductBean();
				bean1.setProductid(rs.getInt(1));
				bean1.setProductname(rs.getString(2));
				bean1.setProductcost(rs.getDouble(3));
				bean1.setProductcategory(rs.getString(4));
				bean1.setDescription(rs.getString(5));
				bean1.setNumberofproducts(rs.getInt(6));
				list.add(bean1);
				return list;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}


	@Override
	public boolean buyProduct(int productid, String cardnumber, int cvv) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertQuery"));){
			pstmt.setInt(1, bean.getProductid());
			pstmt.setString(2, bean.getCardnumber());
			pstmt.setInt(3, bean.getCvv());
			
			int count = pstmt.executeUpdate();
			
			if(count > 0) {
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	

}
