package com.capgemini.contactdetails.bean;

import java.io.Serializable;

public class ContactBean implements Serializable{
	
	private String cname;
	private int cnumber;
	private String cgroup;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCnumber() {
		return cnumber;
	}
	public void setCnumber(int cnumber) {
		this.cnumber = cnumber;
	}
	public String getCgroup() {
		return cgroup;
	}
	public void setCgroup(String cgroup) {
		this.cgroup = cgroup;
	}
	@Override
	public String toString() {
		return "ContactBean [cname=" + cname + ", cnumber=" + cnumber + ", cgroup=" + cgroup + "]";
	}
	
	

}
