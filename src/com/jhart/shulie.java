package com.jhart;

public class shulie {
	
	public static int f(int n) {
		if (n==1) {
			return 0;
		}
		if (n==2) {
			return 1;
		}
		return f(n-1)+f(n-2);
	}
	public static void main(String[] args) {
		int x=5;
		System.out.println("第"+x+"个斐波那契数="+f(x));
	}
	
	
}
