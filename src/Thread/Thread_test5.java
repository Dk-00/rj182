package Thread;

class TickWindow2 extends Thread{
	
	private int tickets=100;
	public void run() {
		while (true) {
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在发售"+tickets--+"张票");
			}else {break;}
	}
}
}
public class Thread_test5 {

	public static void main(String[] args) {
		TickWindow2 tw=new TickWindow2();
		new Thread(tw, "窗口1").start();
		new Thread(tw, "窗口2").start();
		new Thread(tw, "窗口3").start();
		new Thread(tw, "窗口4").start();
	}

}
