package rj182;

public class Jishuhe {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum=0;
		for (int i=1;i<100;i=i+2) {
			sum=sum+i;
		}
		System.out.println("sum="+sum);
		
		sum=0;
		int i=2;
		while (i<=100) {
			sum=sum+i;
			i+=2;
		}
		System.out.println("sum="+sum);
	}

}
