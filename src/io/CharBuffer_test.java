package io;

import java.nio.CharBuffer;

public class CharBuffer_test {

	public static void main(String[] args) {
		CharBuffer charbuffer=CharBuffer.allocate(6);
		System.out.println("容量"+charbuffer.capacity());
		System.out.println("界限值"+charbuffer.limit());
		System.out.println("初始位置"+charbuffer.position());
		
		charbuffer.put('x');
		charbuffer.put('y');
		charbuffer.put('z');
		System.out.println("加入元素后的界限值"+charbuffer.limit());
		System.out.println("加入元素后的初始位置"+charbuffer.position());
		
		charbuffer.flip();
		System.out.println("执行flip()的界限值"+charbuffer.limit());
		System.out.println("执行flip()的初始位置"+charbuffer.position());
		
		System.out.println("取出第一个元素后为"+charbuffer.get());
		System.out.println("取出后的界限值"+charbuffer.limit());
		System.out.println("取出后的位置"+charbuffer.position());
		
		charbuffer.clear();
		System.out.println("执行clear()的界限值"+charbuffer.limit());
		System.out.println("执行clear()的初始位置"+charbuffer.position());
		
		System.out.println("取出第一个元素后为"+charbuffer.get(0));
		System.out.println("取出后的界限值"+charbuffer.limit());
		System.out.println("取出后的位置"+charbuffer.position());
	}

}
