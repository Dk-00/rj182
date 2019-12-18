package com.api;

public class SttingBuffer {

	public static void main(String[] args) {
		String s="我爱你中国";
		StringBuffer zfchc=new StringBuffer(s);
		System.out.println(zfchc);
		
		zfchc.append("!");
		System.out.println(zfchc);
		zfchc.insert(3, ",");
		System.out.println(zfchc);
		
		
		zfchc.delete(2,4);
		System.out.println(zfchc);
		
		zfchc.replace(2,4,"香港");
		System.out.println(zfchc);
		
		zfchc.reverse();
		System.out.println(zfchc);
	}

}
