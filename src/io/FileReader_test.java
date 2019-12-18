package io;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReader_test {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("d:\\kk.txt");
		FileWriter fw=new FileWriter("xx.txt");
		char []buff=new char[2048];
		int b=fr.read(buff);
		while (b!=-1) {
			//System.out.print(buff,0,b);
			fw.write(buff,0,b);
			b=fr.read(buff);
		}
		fr.close();
		fw.close();
	}
		

}
