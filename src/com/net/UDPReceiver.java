package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		//创建套接字
		DatagramSocket ds=new DatagramSocket(8900);
		//将数据转化为二进制数组
		byte[] buf=new byte[1024];
		//创建要发送的数据包
		DatagramPacket dp=new DatagramPacket(buf,buf.length);
		//发送前提示
		System.out.println("等待接收数据.......");
		//通过套接字发送数据包
		while(true) {
			ds.receive(dp);
			
			String xinxi=new String(dp.getData(),0,dp.getLength());
			
			
			System.out.println(xinxi);
		}

	}

}
