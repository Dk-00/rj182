package com.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChatReceiver implements Runnable {
	private DatagramSocket ds;
	public ChatReceiver(DatagramSocket client) {
		this.ds=client;
	}

	@Override
	public void run() {
		
		byte[] buf=new byte[1024];
		//创建要发送的数据包
		DatagramPacket dp=new DatagramPacket(buf,buf.length);
		//通过套接字发送数据包
		while(true) {
			try { 
				ds.receive(dp);
				
				String xinxi=new String(dp.getData(),0,dp.getLength());
				
				
				System.out.println(xinxi);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}

	}

}
