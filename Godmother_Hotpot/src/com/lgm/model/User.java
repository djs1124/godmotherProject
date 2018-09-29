package com.lgm.model;

public class User {
	private int uId; //员工id
	private String uUsername; //员工账号
	private String uPassword; //员工密码
	private int uStatic; //员工状态
	private String uName; //员工姓名
	private int uSex; //员工性别
	private String uPosition; //员工职位
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public int getuStatic() {
		return uStatic;
	}
	public void setuStatic(int uStatic) {
		this.uStatic = uStatic;
	}
	public String getuUsername() {
		return uUsername;
	}
	public void setuUsername(String uUsername) {
		this.uUsername = uUsername;
	}
	public int getuSex() {
		return uSex;
	}
	public void setuSex(int uSex) {
		this.uSex = uSex;
	}
	public String getuPosition() {
		return uPosition;
	}
	public void setuPosition(String uPosition) {
		this.uPosition = uPosition;
	}
	
	
	
}
