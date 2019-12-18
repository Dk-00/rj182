package rj182;

public class Condition {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int age=14;
		if(age<12) {
			System.out.println("此人是小孩");
		}
		else if(age<18) {
			System.out.println("此人未成年");
		}
		else {
			System.out.println("此人已成年");
		}
		
		
		//判断季节
		int month=5;
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("当前时间为冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("当前时间为春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("当前时间为夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("当前时间为秋季");
			break;
		}
		
		
	}

}
