package io;

import java.io.File;
import java.util.Arrays;



public class Filelist_test {

	public static void main(String[] args) {
		File ml=new File("E:\\Java 基础");
		fileDir(ml);
	}

	private static void fileDir(File ml) {
		File[] wjsz=ml.listFiles();
		for(File file:wjsz) {
			if(file.isDirectory()) {
				fileDir(file);
			}else if(file.isFile()) {
				if (file.getName().endsWith(".java")) 
					System.out.println(file);
				
			}
		}
		
		
	}

}
