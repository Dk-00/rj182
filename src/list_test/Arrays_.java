package list_test;

import java.util.Arrays;

public class Arrays_ {
	
public static void main(String[] args) {
	int[]arr= {9,8,3,5,2};
	System.out.print("排序前");
	printArray(arr);
	Arrays.sort(arr);
	System.out.print("排序后");
	printArray(arr);

	int index=Arrays.binarySearch(arr,3);
	System.out.println("元素3的索引是："+index);
	int [] copiedArr=Arrays.copyOfRange(arr,2,8);
	System.out.println("\n被拷贝的数组是");
	printArray(copiedArr);
	Arrays.fill(copiedArr, 8);
	printArray(copiedArr);
}

private static void printArray(int[] arr) {
	System.out.print("[");
	for(int x=0;x<arr.length;x++) {
		if(x!=arr.length-1) {
			System.out.print(arr[x]+",");
		}else {
			System.out.print(arr[x]+"]");
		}
	}
	
}
}
