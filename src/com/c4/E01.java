package com.c4;

class Animal {
		 String name;
		void shout() {
			System.out.println("动物叫声");
	}
}	
class Dog extends Animal{
	public void printName() {
		System.out.println("name="+name);	
	}
	
}
public class E01 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog dog=new Dog();
		dog.name="sad";
		dog.printName();
		dog.shout();
	}

}
