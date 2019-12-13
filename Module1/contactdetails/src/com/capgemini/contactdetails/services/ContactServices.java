package com.capgemini.contactdetails.services;

import java.util.List;

import com.capgemini.contactdetails.bean.ContactBean;

public interface ContactServices {
		public List<ContactBean> getAllContacts();
		public boolean insertUser(ContactBean contact);
		public boolean deleteUser(int cnumber);
		public boolean updateUser(String cname,int cnumber,String cgroup);
		
		
	}



