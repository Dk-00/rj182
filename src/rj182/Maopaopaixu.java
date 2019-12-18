package rj182;

public class Maopaopaixu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arr= {8,9,3,7,2};
		System.out.println("这个数组的长度是"+arr.length);
		for (int says:arr) {
			System.out.print(says+"");
		}
		System.out.println();
		
		
		for(int i=1;i<arr.length;i++) {
			
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"");
		}
	}

}
