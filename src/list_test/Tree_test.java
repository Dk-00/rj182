package list_test;
import java.util.TreeSet;
class Teacher implements Comparable<Object>{
	String name;
	int age;
	public Teacher(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+":"+age;
	}
	public int compareTo(Object obj) {
		Teacher s=(Teacher) obj;
		if(this.age-s.age>0) {
			return 1;
		}
		if(this.age-s.age==0) {
			return this.name.compareTo(s.name);
		}
		return -1;
	}
}
public class Tree_test {

	public static void main(String[] args) {
		TreeSet<Teacher> ts=new TreeSet<Teacher>();
		ts.add(new Teacher("jack", 19));
		ts.add(new Teacher("rose", 18));
		ts.add(new Teacher("tom", 19));
		ts.add(new Teacher("rose", 18));
		System.out.println(ts);

	}

}
