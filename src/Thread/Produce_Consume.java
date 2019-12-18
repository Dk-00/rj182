package Thread;

import java.util.ArrayList;
import java.util.List;

public class Produce_Consume {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<Object>good=new ArrayList<>();
		long start=System.currentTimeMillis();
		
		
		Thread thread1=new Thread(()->  {
			int num=0;
			while(System.currentTimeMillis()-start<=30) {
				synchronized (good) {
					if (good.size()>0) {
						try {
							good.wait();
						} catch (InterruptedException e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					} else {
						good.add("商品" +(++num));
						System.out.println("生产商品"+num);
					}
				}
				
			}
		},"生产者");
		
		
		Thread thread2=new Thread(()->  {
			int j=0;
			while(System.currentTimeMillis()-start<=30) {
				synchronized (good) {
					if (good.size()>0) {
						
							good.notify();
						
					} else {
						good.remove("商品" +(++j));
						System.out.println("生产商品"+j);
					}
				}
				
			}
		},"生产者");
		
		thread1.start();
		thread2.start();
	}

}
