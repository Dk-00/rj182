package com.api;

public class Baozhuang_class {

	public static void main(String[] args) {
		int a=20;
		Integer b=a;
		System.out.println(b);
		int c=b;
		System.out.println(c);

		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);  
		
		String chengji="88";
		String chengji1=chengji+10;
		System.out.println("No.1:包装的valueof方法---"+(Integer.valueOf(chengji)+10));
		System.out.println("No.2:包装的parseXXX方法---"+(Integer.parseInt(chengji)+10));
		System.out.println("No.2:包装的的构造方法---"+(new Integer(chengji)+10));
		
		Integer sz=88;
		System.out.println("No.1:包装的valueof方法---"+String.valueOf(chengji));
		System.out.println("No.2:string的tostring方法---"+chengji.toString());
		System.out.println("No.2:空串连接整数法---"+chengji+"");
		
		
	}

}
