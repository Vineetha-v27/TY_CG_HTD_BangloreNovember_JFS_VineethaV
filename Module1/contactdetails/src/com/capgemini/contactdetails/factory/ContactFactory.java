package com.capgemini.contactdetails.factory;

import java.util.List;

import com.capgemini.contactdetails.bean.ContactBean;
import com.capgemini.contactdetails.dao.ContactDao;
import com.capgemini.contactdetails.dao.ContactDaoImpl;
import com.capgemini.contactdetails.services.ContactServices;
import com.capgemini.contactdetails.services.ContactServicesImpl;

public class ContactFactory {
	public  class instanceOfDAOImpl implements ContactDao {
		@Override
		public List<ContactBean> getAllContacts() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public boolean addContact(ContactBean bean) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean deleteContact(int cnumber) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean modifyContact(String cname, int cnumber, String cgroup) {
			// TODO Auto-generated method stub
			return false;
		}
		private void ContactFactory() {

		}



	}

	public static ContactDao instanceOfContactDaoImpl() {
		ContactDao dao =  new ContactDaoImpl();
		return dao;

	}

	public static ContactServices instanceOfUserServices() {
		ContactServices services = new ContactServicesImpl();
		return services;


	}

}
