package Thread;


class YieldThread extends Thread{
	public YieldThread(String name) {
		super();
	}
	public void run(){
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"----"+i);
			if (i==2) {
				System.out.println("线程让步：");
				Thread.yield();
			}
		}
	}
}
public class Thread_test9 {

	public static void main(String[] args) {
		new YieldThread("线程1").start();
		new YieldThread("线程2").start();
	}

}
