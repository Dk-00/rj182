package rj182;

public class Countinue {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				continue;
			}
			sum+=1;
		}
		System.out.println("sum="+sum);
	}

}
