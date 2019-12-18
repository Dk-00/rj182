package Final;
 class Animal{
	 //如果一个成员变量被final修饰，则该变量在本类中不能再被赋值
	 final String name="动物";
	 public void shout() {}
	 public String toString() {
		return "这是一动物";
	}
 }
class Dog extends Animal{
	 @Override
	 public void shout() {}
	 @Override
	 public String toString() {
			return "这是一狗子";
		}
}
public class E08 {

		public static void main(String[] args) {
			Animal dw=new Animal();
			Dog dw2=new Dog();
			System.out.println(dw.toString());
			System.out.println(dw2.toString());
		}
}
