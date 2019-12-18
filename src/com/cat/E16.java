package com.cat;
interface Animal{
void shout();

void catchMan();

}

class Tiger implements Animal{
	public void shout() {
		System.out.println("hehahahahha~");
	}
	public void catchMan() {
		System.out.println("你叫破喉咙也没用");
	}
}

class Dog implements Animal{
	public void shout() {
		System.out.println("汪汪汪");
	}

	@Override
	public void catchMan() {
		// TODO 自动生成的方法存根
		
	}
}

public class E16 {

	public static void main(String[] args) {
		Animal an1=new Dog();
		if(an1 instanceof Tiger) {
			Tiger tiger=(Tiger) an1;
			tiger.shout();
			tiger.catchMan();
		}else {
			System.out.println("该类型的对象不是tiger类型");
		}
	}
}
