package com.Abstract;
abstract class Animal{
	//shout()
	public abstract void shout() ;
		
}

class Dog extends Animal{
	public void shout() {
		System.out.println("汪汪");
	}
}
public class E12 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();

	}

}
