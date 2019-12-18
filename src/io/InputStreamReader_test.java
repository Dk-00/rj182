package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.InputStreamReader;



public class InputStreamReader_test {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("自我介绍：");
		String line=br.readLine();
		int i=1;
		BufferedWriter bw = null;
		while (i!=3) {
			if(i==1) {
				System.out.println("请输入您的姓名：");
				line=br.readLine();
				bw.write("您叫"+line);
			}
			else if(i==2) {
				System.out.println("请输入您的年龄：");
				line=br.readLine();
				int age=Integer.parseInt(line);
				System.out.println("您去年是"+(age-1)+"岁");
				i--;
			}
		}
		System.out.println("介绍完成！");
		br.close();
		bw.flush();
		bw.close();
	}

}
