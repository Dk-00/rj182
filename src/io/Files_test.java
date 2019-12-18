package io;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Files_test {

	public static void main(String[] args) throws Exception {
		Path wj=Paths.get("d:\\1123\\123\\test.txt");
		
		Files.createFile(wj);
		
		List<String> neirong=new ArrayList<>();
		
		neirong.add("我爱你！");
		Files.write(wj, neirong, StandardOpenOption.APPEND);
		List<String> list=Files.readAllLines(wj);
		System.out.println("文件的内容是"+list);
		System.out.println("文件的大小为"+Files.size(wj)+"个字节");
	}

}
