package com.api;

public class E53 {

	public static void main(String[] args) {
		String s1="Starter";
		String s2="St";
		System.out.println("判断字符是否以St结尾"+s1.startsWith("St"));
		System.out.println("判断是否以字符er结尾"+s1.endsWith("St"));
		System.out.println("判断是否包含字符er"+s1.concat("ar"));
		System.out.println("判断字符是否为空"+s1.isEmpty());
		System.out.println("判断两个字符串是否相等"+s1.equals(s2));
	}

}
