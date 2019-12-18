package list_test;
import java.util.ArrayList;
import java.util.Iterator;
public class Diedai_xiugai {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
			list.add("Jack");
			list.add("Rose");
			list.add("Annie");
			list.add("Tom");
			Iterator<String> iterator =list.iterator();
			while(iterator.hasNext()) {
				Object obj=iterator.next();
				if ("Annie".equals(obj)) {
					list.remove(obj);
				}
			}
			System.out.println(list);
	}

}
