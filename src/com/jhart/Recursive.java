package com.jhart;

import javax.print.attribute.standard.RequestingUserName;

public class Recursive {

		public static int getsum(int n) {
			if(n==1) {
				return 1;
			}
			int temp= getsum(n-1);
			return temp+n;
	}
		public static void main(String[] args) {
			int sum=getsum(4);
			System.out.println("sum="+sum);
		}
}
		
