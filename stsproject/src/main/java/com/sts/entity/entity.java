package com.sts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class entity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String password;
	private long   contectNum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getContectNum() {
		return contectNum;
	}
	public void setContectNum(long contectNum) {
		this.contectNum = contectNum;
	}
	@Override
	public String toString() {
		return "entity [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", contectNum="
				+ contectNum + "]";
	}
	public entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
