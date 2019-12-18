package list_test;

import java.util.TreeSet;

public class TreeSet_test {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(25);
		ts.add(8);
		ts.add(17);
		ts.add(17);
		ts.add(13);
		ts.add(11);
		ts.add(1);
		ts.add(15);
		System.out.println("创建的Treeset为"+ts);
		System.out.println("TreeSet集合首元素为"+ts.first());
		System.out.println("TreeSet集合尾元素为"+ts.first());
		System.out.println("集合中小于或等于9的最大一个元素为"+ts.floor(10));
		System.out.println("集合中小于或等于10的最小一个元素为"+ts.higher(10));
		System.out.println("集合中小于或等于100的最小一个元素为"+ts.higher(100));
		
		Object first=ts.pollFirst();
		System.out.println("删除的第一个元素是"+first);
		System.out.println("删除的第一个元素后TreeSet集合变为"+ts);
	}

}
