package list_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Diedai {

	public static void main(String[] args) {
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("stu1");
		arraylist.add("stu2");
		arraylist.add("stu3");
		arraylist.add("stu4");
		arraylist.add("");
		System.out.println("数组列表arraylist的长度："+arraylist.size());
		System.out.println("数组列表arraylist第二个元素是："+arraylist.get(1));
		
		Iterator<String> diedai=arraylist.iterator();
		while(diedai.hasNext()) {
			String dgys=diedai.next();
			System.out.println(dgys);
		}
		System.out.println("使用foreach循环输出每个元素：");
		for(String mgys:arraylist) {
			System.out.println(mgys);
		}
		
		System.out.println("利用列表集合对象使用JDK8的foreach循环输出每个元素");
		arraylist.forEach(obj->System.out.println(obj));
		
		System.out.println("利用列表集合对象使用JDK8的foreach循环输出每个元素");
		@SuppressWarnings("unused")
		Iterator<String> diedai2=arraylist.iterator();
	
		
		LinkedList<String> linkedlist=new LinkedList<String>();
		linkedlist.add("stu1");
		linkedlist.add("stu2");
		linkedlist.offer("offer");
		linkedlist.push("push");	
	
		System.out.println("链表linkedlist的长度是"+linkedlist.size());
		System.out.println("链表linkedlist最后一个元素是"+linkedlist.getLast());
		System.out.println("链表linkedlist第一个元素是"+linkedlist.getFirst());
		System.out.println(linkedlist);
		
		String dygys=linkedlist.peek();
		System.out.println("链表linkedlist第一个元素是"+dygys);
		
		linkedlist.removeFirst();
		linkedlist.pollLast();
		System.out.println(linkedlist);
		
	}

	public static boolean hasNext() {
		// TODO 自动生成的方法存根
		return false;
	}

	public static Object next() {
		// TODO 自动生成的方法存根
		return null;
	}

}
