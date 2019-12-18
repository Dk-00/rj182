package rj182;

public class Operator {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i=1;
		int j=1;
		System.out.println("后加"+(i++));
		System.out.println("后加"+(++j));
		System.out.println("不管是先加还是后加值都加了一，"+i);
		System.out.println("不管是先加还是后加值都加了一，"+j);
		int a=2;
		a+=3;
		System.out.println(a);
		//比较运算符
		String s1="hello";
		String s2="hello";
		E01 e1=new E01();
		E01 e2=new E01();
		System.out.println(s1==s2);
		System.out.println(e1==e2);
	}

}
