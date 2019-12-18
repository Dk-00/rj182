package yichang;

public class E29 {

		
	public static void main(String[] args) {
		
			int result=divider(4,0);
			if (result==-1) {
				System.out.println("程序发生错误");
			}else {
				System.out.println(result);
			}
		
		
	}
	private static int divider(int x, int y) {
		try {
			int result=x/y;
			return result;
		} catch (Exception e) {
			System.out.println(""+e.getMessage());
		}finally {
			System.out.println("执行finally代码块");
		}
		return -1;
	}

}
