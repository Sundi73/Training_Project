package com.pack.opps;

public class encapsulationExp {
	
	private int eid;
	private String name,address;
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public static void main(String[] args) {
		encapsulationExp e = new encapsulationExp();
		encapsulationExp e2 = new encapsulationExp();
		e.setEid(101);
		e.setName("Ram");
		e.setAddress("Delhi");
		e2.setEid(102);
		e2.setName("Shyam");
		e2.setAddress("Mumbai");
		
		System.out.println(e.getEid()+" "+e.getName()+" "+e.getAddress());
	}
	

}
