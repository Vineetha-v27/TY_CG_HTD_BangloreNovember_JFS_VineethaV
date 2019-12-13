package com.capgemini.contactdetails.controller;

import java.util.Scanner;

import com.capgemini.contactdetails.bean.ContactBean;
import com.capgemini.contactdetails.factory.ContactFactory;
import com.capgemini.contactdetails.services.ContactServices;

public class Insert {
	public static void main(String[] args) {
		ContactServices services = ContactFactory.instanceOfUserServices();
		ContactBean contact = new ContactBean();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter contact name");
		contact.setCname(sc.nextLine());
		System.out.println("enter contact number");
		contact.setCnumber(Integer.parseInt(sc.next()));
		System.out.println("enter contact group");
		contact.setCgroup(sc.nextLine());
		if(services.insertUser(contact)) {
			System.out.println("Contact details added");
		}else {
			System.err.println("something went wrong");
		}
		sc.close();
	}

}
