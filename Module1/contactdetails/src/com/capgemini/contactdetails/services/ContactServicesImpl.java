package com.capgemini.contactdetails.services;

import java.util.List;

import com.capgemini.contactdetails.bean.ContactBean;
import com.capgemini.contactdetails.dao.ContactDao;
import com.capgemini.contactdetails.factory.ContactFactory;

public class ContactServicesImpl implements ContactServices{
	ContactDao dao =  ContactFactory.instanceOfContactDaoImpl();
	
	@Override
	public List<ContactBean> getAllContacts() {
		
		return null;
	}

	@Override
	public boolean insertUser(ContactBean contact) {
		
		return false;
	}

	@Override
	public boolean deleteUser(int cnumber) {
		
		return false;
	}

	@Override
	public boolean updateUser(String cname, int cnumber, String cgroup) {
		
		return false;
	}
	

}
