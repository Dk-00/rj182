package list_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_test {

	public static void main(String[] args) throws IOException{
		Properties sxj=new Properties();
		sxj.load(new FileInputStream("d:\\test.properties"));
		sxj.forEach((k,v)->System.out.println(k+":"+v));
		FileOutputStream out=new FileOutputStream("d:\\test.properties");
		sxj.setProperty("charset", "UTF-8");
		sxj.store(out, "新增charset编码");
	}

}
