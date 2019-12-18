package com.jhart;

public class Text {
	public Text() {
		System.out.println("构造方法一被调用了");
	}
	public Text(int x) {
		this();
		System.out.println("构造方法二被调用了");
	}
	public Text(boolean b) {
		this(1);
		System.out.println("构造方法三被调用了");
	}
	public static void main(String[] args) {
		Text text=new Text(true);
	}
}
