package rj182;

/**title test01
 * @author D.k
 *@version 1.1
 */
public class Text01 {
	/**title test01
	 * 
	 * 这是一个main（）方法入口
	 * @param args 
	 */
	/*不同颜色的字符代表不同的类型  紫色是关键字
	 * 		褐色是参数或局部变量
	 * 		蓝色代码是成员变量
	 * 		黑色代码是标示符
	*/
	public static void main(String[] args) {
		byte b=1;
		short s=1;
		int i=1;
		long l=1;
		float f=1.0f;
		double d=1.0;
		char c='a';
		char ci=97;
		short cc=97;
		boolean flag1=true;
		boolean flag2=false;
		
		System.out.println(c);
		System.out.println(ci);
		System.out.println((char)cc);
		System.out.println("字节整数数据的长度是"+Byte.SIZE);
		System.out.println("短整形整数数据的长度是"+Short.SIZE);
		System.out.println("整形整数数据的长度是"+Integer.SIZE);
		System.out.println("长整形整数数据的长度是"+Long.SIZE);
		
		
		System.out.println("单精度浮点型数据的长度是"+Float.SIZE);
		System.out.println("双精度浮点型数据的长度是"+Double.SIZE);
		
		
		System.out.println("字节整形整数数据的范围是"+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
		System.out.println("短整形整数数据的范围是"+Short.MIN_VALUE+"-"+Short.MAX_VALUE);
		System.out.println("整形整数数据的范围是"+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);
		System.out.println("长整形整数数据的范围是"+Long.MIN_VALUE+"-"+Long.MAX_VALUE);
		
		
		System.out.println("单精度浮点型数据的范围是"+Float.MIN_VALUE+"-"+Float.MAX_VALUE);
		System.out.println("双精度浮点型数据的范围是"+Double.MIN_VALUE+"-"+Double.MAX_VALUE);
		System.out.println("字符型数据的范围是"+Character.MIN_VALUE+"-"+Character.MAX_VALUE);
		System.out.println("布尔型数据的范围是"+Boolean.TRUE+"-"+Boolean.FALSE);
	
	}

}
