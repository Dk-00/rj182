package com.api;

public class E5_4 {

	public static void main(String[] args) {
		String s1="java";
		System.out.println("s1转化成大写后是"+s1.toUpperCase());
		System.out.println("整数12转化成字符串结果："+String.valueOf(12));
		
		String s2="    http://localhost: 8080     ";
		System.out.println("去除字符串俩端空格的结果："+s2.trim());
		System.out.println("去除字符串所有空格的结果："+s2.replace("", ""));
		
		System.out.println("字符串取得掉所有空格后"+s2.replaceAll("\\S",""));
	}

}
