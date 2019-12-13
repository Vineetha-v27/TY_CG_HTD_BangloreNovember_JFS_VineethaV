package com.capgemini.contactdetails.dao;

import java.util.List;

import com.capgemini.contactdetails.bean.ContactBean;

public interface ContactDao {
	public List<ContactBean> getAllContacts();
	
	boolean addContact(ContactBean bean);
	boolean deleteContact(int cnumber);
	boolean modifyContact(String cname,int cnumber,String cgroup);
	
	
	

}
