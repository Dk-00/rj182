package list_test;
import java.util.ArrayList;
import java.util.LinkedList;

public class E6_1 {

	public static void main(String[] args) {
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("stu1");
		arraylist.add("stu2");
		arraylist.add("stu3");
		arraylist.add("stu4");
		arraylist.add("");
		System.out.println("数组列表arraylist的长度："+arraylist.size());
		System.out.println("数组列表arraylist第二个元素是："+arraylist.get(1));
		
		
		
		
		
		LinkedList<String> Linkedlist=new LinkedList<String>();
		Linkedlist.add("stu1");
		Linkedlist.add("stu2");
		Linkedlist.offer("offer");
		Linkedlist.push("push");
		Linkedlist.add("");
		
		System.out.println("链表Linkedlist的长度："+Linkedlist.size());
		System.out.println("链表Linkedlist最后一个元素是："+Linkedlist.getLast());
		System.out.println("链表Linkedlist第一个元素是："+Linkedlist.getFirst());
		System.out.println(Linkedlist);
		
		String dygys=Linkedlist.peek();
		System.out.println("链表Linkedlist第一个元素是："+dygys);
		
		Linkedlist.removeFirst();
		Linkedlist.pollLast();
		System.out.println(Linkedlist); 
	}

}
