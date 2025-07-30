//pojo class
package com.io;

import java.io.Serializable;

public class Employee implements Serializable {
	
	//fields
	private int eid;
	private String ename;
	private long mblno;
	
	//constructor
	public Employee(int eid, String ename, long mblno) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.mblno = mblno;
	}
	
	//methods
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public long getMblno() {
		return mblno;
	}
	public void setMblno(long mblno) {
		this.mblno = mblno;
	}
	
	//To String()
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", mblno=" + mblno + "]";
	}

}
