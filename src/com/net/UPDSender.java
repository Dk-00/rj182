package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UPDSender {

	public static void main(String[] args) throws Exception {
		//创建套接字
		DatagramSocket ds=new DatagramSocket(30000);
		//定义要发送的数据
		String str="来自董凯的问候";
		//将数据转化为二进制数组
		byte[] zjsz=str.getBytes("UTF-8");
		//创建要发送的数据包
		DatagramPacket dp=new DatagramPacket(zjsz, zjsz.length,InetAddress.getByName("10.2.103.31"),8900);
		//发送前提示
		System.out.println("开始发送信息.......");
		//通过套接字发送数据包
		ds.send(dp);
	}

}
