package lajihuishou;
class Person{
	public void flinalize() {
		System.out.println("对象将作为垃圾回收...");
	}	
}

public class E37 {
public static void recycleWaster1() {
	Person p1=new Person();
	p1=null;
	int i=1;
	while(i<10) {
		System.out.println("方法一循环中...");
		i++;
	}
}
public static void recycleWaster2() {
	Person p2=new Person();
	p2=null;
	System.gc();
	int i=1;
	while(i<10) {
		System.out.println("方法er循环中...");
		i++;
	}
}


	public static void main(String[] args) {
		recycleWaster1();
		System.out.println("================");
		recycleWaster2();

	}

}
