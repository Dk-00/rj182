package com.jhart;

public class Person {

	public String sfzh;
	public String getSfzh() {
		return sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	public Person() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Person(String sfzh, String name) {
		super();
		this.sfzh = sfzh;
		this.name = name;
	}
	
}
