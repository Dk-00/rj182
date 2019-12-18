package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileInputStream_test {

	public static void main(String[] args) throws Exception {
	FileInputStream fin=new FileInputStream("d:\\001.jpg");
	FileOutputStream fout=new FileOutputStream("c:\\001.jpg");
	byte[]zjhc= new byte[1024];
	long kssj=System.currentTimeMillis();
	int  b=fin.read(zjhc);
	while (b!=-1) {
		//System.out.println((char)b);
		fout.write(zjhc,0,b);
		b=fin.read(zjhc);
	}
	long jssj=System.currentTimeMillis();
	System.out.println("拷贝这张图片耗时"+(jssj-kssj)+"毫秒");
	//fout.write(",come on!".getBytes());
	fin.close();
	fout.close();
	}

}
