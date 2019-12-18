package io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class Channels_test {

	public static void main(String[] args) throws Exception {
		RandomAccessFile infile=new RandomAccessFile("d:\\sherry.txt","rw");
		FileChannel inChannel=infile.getChannel();
		RandomAccessFile outfile= new RandomAccessFile("c:\\sherry.txt", "rw");
		FileChannel outChannel=infile.getChannel();
		long transferTo=inChannel.transferTo(0,inChannel.size(),outChannel);
		if (transferTo>0) {
			System.out.println("复制成功");
		}
		inChannel.close();
		infile.close();
		outfile.close();
		outChannel.close();
	}

}
