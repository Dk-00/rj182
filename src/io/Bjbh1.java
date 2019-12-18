package io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bjbh1 {

	public static void main(String[] args) throws Exception {
		Path wj=Paths.get("d:\\班级信息.txt");
		Path bjmc=Paths.get("d:\\班级信息.txt");
		Path bjbh=Paths.get("d:\\班级信息.txt");
		
		List<String> lines=Files.readAllLines(wj);
		List<String> names=Files.readAllLines(bjmc);
		List<String> neirong=new ArrayList<>();
		Map<String, String> map=new HashMap<>();
		for(String line:lines) {
			String[] zfcsz=line.split("\t");
			map.put(zfcsz[1],zfcsz[0]);
		}
		for(String name:names) {
			neirong.add(map.get(name));
		}
		Files.write(bjbh, neirong, StandardOpenOption.APPEND);
	}

}
