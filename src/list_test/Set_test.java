package list_test;

import java.util.ArrayList;
import java.util.HashSet;

public class Set_test {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("jack");
		set.add("eva");
		set.add("rose");
		set.add("rose");
		
		set.forEach(o->System.out.println(o));
		
		HashSet<Object> hset=new HashSet<>();
		hset.add(new String("jack"));
		hset.add(new String("eva"));
		hset.add(new String("rose"));
		hset.add(new String("rose"));
		hset.add(new String("pete"));
		
		ArrayList<Object> list=new ArrayList<>();
		list.add("string");
		list.add("collection");
		list.add(1);
		for (@SuppressWarnings("unused") Object obj:list) {
			System.out.println();
		}
	}

}
