package com.zhiyou100.ssm.model;

import java.util.List;

public class RoleVO {
	private String sousuo;
	private String ziduan;
	private String username;
	private String password;
	private int page;
 private Role r;
 private List<Role> list;
public String getSousuo() {
	return sousuo;
}
public void setSousuo(String sousuo) {
	this.sousuo = sousuo;
}
public String getZiduan() {
	return ziduan;
}
public void setZiduan(String ziduan) {
	this.ziduan = ziduan;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getPage() {
	return page;
}
public void setPage(int page) {
	this.page = page;
}
public Role getR() {
	return r;
}
public void setR(Role r) {
	this.r = r;
}
public List<Role> getList() {
	return list;
}
public void setList(List<Role> list) {
	this.list = list;
}
@Override
public String toString() {
	return "RoleVO [sousuo=" + sousuo + ", ziduan=" + ziduan + ", username=" + username + ", password=" + password
			+ ", page=" + page + ", r=" + r + ", list=" + list + "]";
}


}