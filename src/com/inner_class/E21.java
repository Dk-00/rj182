package com.inner_class;
@FunctionalInterface
interface Animal{
	void shout();
}
@FunctionalInterface
interface Calculate{
	int  sum(int a,int b);
}
class Cat implements Animal{

	@Override
	public void shout() {
		// TODO 自动生成的方法存根
		
	}
	
}
public class E21 {
	public static void main(String[] args) {
		String name="小白";
		animalShout(new Animal(){
			public void shout() {
				System.out.println("匿名内部类输出"+name+"喵喵");
			}
		});
			animalShout(()->System.out.println("Lambda 表达式输出："+name+"喵喵喵"));
			showSum(10,30,(x,y)->x+y);
	}
private static void showSum(int i,int j, Calculate c) {
	System.out.println(i+"+"+j+"的和为："+c.sum(i,j));
}

private static void animalShout(Animal an) {
	an.shout();
}	
}