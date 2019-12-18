package list_test;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Test test=new Test();
		ArrayList<Object> arrayList=new ArrayList<>();
		long kssj1=System.currentTimeMillis();
		test.listInsert(arrayList);
		long jssj1=System.currentTimeMillis();
		System.out.println("数组列表头部插入15万个元素耗时："+(jssj1-kssj1)+"毫秒");
		
		
		LinkedList<Integer> LinkedList=new LinkedList<>();
		long kssj2=System.currentTimeMillis();
		test.listInsert(LinkedList);
		long jssj2=System.currentTimeMillis();
		System.out.println("数组列表头部插入15万个元素耗时："+(jssj2-kssj2)+"毫秒");
		
		
		long kssj3=System.currentTimeMillis();
		test.listRead(arrayList);
		long jssj3=System.currentTimeMillis();
		System.out.println("数组列表尾部读取插入15万个元素耗时："+(jssj3-kssj3)+"毫秒");
		
	}

}
class Test{

	public void listInsert(ArrayList<Object> arrayList) {
		for(int i=0;i<150000;i++) {
			arrayList.add(0,1);
		}
		
	}

	public void listRead(ArrayList<Object> arrayList) {
		for(int i=150000-1;i>=0;i--) {
			arrayList.get(i);
		}
		
		
	}

	public void listInsert(LinkedList<Integer> linkedList) {
		for(int i=0;i<150000;i++) {
			linkedList.add(0,1);
		}
		
	}

}