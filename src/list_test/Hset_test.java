package list_test;



import java.util.HashSet;

class Student1{
	String id;
	String name;
	public Student1(String id,String name) {
		this.id=id;
		this.name=name;
}
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Student other=(Student) obj;
		return this.id.equals(other.id);
	}
	@Override
	public String toString() {
		return id+":"+name;
	}
}
public class Hset_test {

	public static void main(String[] args) {
		Student1 s1=new Student1("1", "Mike");
		Student1 s2=new Student1("1", "Mike");
		Student1 s3=new Student1("3", "Mary");
		HashSet<Student1> hset=new HashSet<Student1>();
		hset.add(s1);
		hset.add(s2);
		hset.add(s3);
		System.out.println(hset);
		
	}	
}