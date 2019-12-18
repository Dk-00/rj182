package com.api;
import java.util.Random;
public class Random_test {

	public static void main(String[] args) {
		System.out.println("随机生成【0-1】之间的一个浮点数"+Math.random());
		Random r=new Random();
		System.out.println("随机生成【0-1】之间的一个浮点数"+r.nextDouble());
	}



}
