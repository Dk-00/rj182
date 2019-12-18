package com.object;

class Animal extends java.lang.Object{
	public String toString() {
		return "这是一动物";
		
	}
	}

public class E06 {

	public static void main(String[] args) {
		Animal dw=new Animal();
		Animal dw2=new Animal();
		System.out.println(dw.toString());
		System.out.println(dw2.toString());
	}

}
