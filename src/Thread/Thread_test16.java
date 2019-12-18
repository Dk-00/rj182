package Thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Thread_test16 {

	public static void main(String[] args) throws Exception, ExecutionException {
		// TODO 自动生成的方法存根
		CompletableFuture<Integer> cf1=CompletableFuture.supplyAsync(()->{
			int sum=0;
			for(int i=1;i<11;i++) {
				sum+=i;
				System.out.println(Thread.currentThread().getName()+"线程正在执行i"+i);
			}
			return sum;
		});
		CompletableFuture<Integer> cf2=CompletableFuture.supplyAsync(()->{
			int sum=0;
			for(int j=11;j<21;j++) {
				sum+=j;
				System.out.println(Thread.currentThread().getName()+"线程正在执行j"+j);
			}
			return sum;
		});
			int total=cf1.get()+cf2.get();
			System.out.println("两个线程求和的结果是"+total);
	
	}

}
