package com.api;

import java.io.IOException;

public class E5_12 {

	public static void main(String[] args) throws InterruptedException, IOException {
		Runtime rt=Runtime.getRuntime();
		System.out.println("处理器个数："
				+rt.availableProcessors()+"个");
		System.out.println("空闲内存大小："
				+rt.freeMemory()/1024/1024+"M");
		System.out.println("最大可用内存大小："
				+rt.maxMemory()/1024/1024+"M");

		Process jincheng=rt.exec("notepad");
		Thread.sleep(3000);
		jincheng.destroy();
	}

}
