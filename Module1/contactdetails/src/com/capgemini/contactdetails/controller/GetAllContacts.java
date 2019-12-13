package com.capgemini.contactdetails.controller;

import java.util.List;

import com.capgemini.contactdetails.bean.ContactBean;
import com.capgemini.contactdetails.factory.ContactFactory;
import com.capgemini.contactdetails.services.ContactServices;

public class GetAllContacts {
	public static void main(String[] args) {
		ContactServices services = ContactFactory.instanceOfUserServices();
		
		List<ContactBean> list = services.getAllContacts();
		if(list!=null) {
			for(ContactBean contact : list) {
				System.out.println(contact);
				
			}
		}
		
	}

}
