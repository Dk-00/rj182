package rj182;
class Student{
	static String schoolName;
}
public class E12 {

	public static void main(String[] args) {
		//只能调用
		Student s1=new Student();
		Student s2=new Student();
		Student.schoolName="江汉艺术";
				
		System.out.println("我是"+s1.schoolName+"学生");
		System.out.println("我是"+s2.schoolName+"学生");
	}

}
