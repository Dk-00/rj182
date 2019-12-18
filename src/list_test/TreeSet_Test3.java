package list_test;

import java.util.TreeSet;

public class TreeSet_Test3 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>(new MyComparator());
		ts.add("jack");
		ts.add("jack");
		ts.add("eva");
		ts.add("serena");
		ts.add("rose");
		System.out.println(ts);

	}

}
