package rj182;

import java.io.Serializable;
public class Leiclass extends Object implements Serializable{
		//修饰符+class+类名
		public static final class A  extends Object implements Serializable{}    //公有的  ，static 静态的 
		private static final class B  extends Object implements Serializable{}   //私有的，final 最终的，表示不可继承
		protected static final class C  extends Object implements Serializable{} //受保护的
		class D{}           //默认
		public static final int age=12;
		public static final String name="dake";
		
		
		public synchronized  void setAge (int nianling) {}
		public synchronized int  getAge() {return 0;}
		
	}
