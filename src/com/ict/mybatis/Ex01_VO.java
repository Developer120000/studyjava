package com.ict.mybatis;

// VO(Value object) : DB 컬럼의 정보를 담기 위한 클래스
public class Ex01_VO {
	// 반드시 컬럼명과 같은 이름으로 만들자
	private String custid, name, address, phone;
	
	public Ex01_VO() {}
	
	public Ex01_VO(String custid, String name, String address, String phone) {
		this.custid = custid;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	
	
	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}
