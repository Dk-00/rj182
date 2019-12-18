package com.Interface;


interface Animal{
	//接口成员变量声明时，可以省略public static final 三个关键字
	int ID=1;
	//接口普通成员方法声明时，可以省略public abstract俩关键字 
	void shout() ;
	//接口内不能用普通方法，要用静态方法
	static int getID() {
		return Animal.ID;
	}
}
interface LandAnimal extends Animal{
	void run();
}
class Dog implements LandAnimal{
	int id;
	public Dog() {
		super();
	}
	@Override
	public void shout() {
		System.out.println("汪汪");
	}
	@Override
	public void run() {
		System.out.println("小狗在跑");
	}
	
}



public class E13 {

	public static void main(String[] args) {
		System.out.println(Animal.getID());
		Dog dog=new Dog();
		dog.run();
		dog.shout();

	}

}
