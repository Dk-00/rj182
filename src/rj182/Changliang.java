package rj182;

public class Changliang {
	public static void main(String[] args) {
		System.out.println("二进制以0b开头"+0b11000110);
		System.out.println("八进制以0开头"+0306);
		System.out.println("十六进制以0x开头"+0xc6);
		
		System.out.println("单精度浮点数以f结尾"+5.022e+6f);
		System.out.println("双精度浮点数以d结尾"+5.022e+6d);
		System.out.println("双精度浮点数以d可以忽略"+5.022e+6);
		
		System.out.println("我的名字"+'\u8463'+'\u51ef'+'\u51ef');
		
		System.out.println("Hello,\nSeptember!");
		System.out.println("布尔型常量"+true+"或者"+false);
		System.out.println("null常量只有一个!"+null+",表示空对象");
		//同变量类似的变量要使用final关键字，常量被赋值后不能再次被修改
		final int  a=5;
	}
}
