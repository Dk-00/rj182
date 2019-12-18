package Thread;


class DeadLockThread implements Runnable{
	static Object chopsticks=new Object();
	static Object kinfeAndFork=new Object();
	private boolean flag;
	public DeadLockThread(boolean flag) {
		// TODO 自动生成的构造函数存根
		this.flag=flag;
	}
	public void run() {
		if (flag) {
			while(true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---if---chopaticks");
					synchronized (kinfeAndFork) {
						System.out.println(Thread.currentThread().getName()+"---if---kinfeAndFork");	
					}
				}
			}
		}else {
			while(true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---else---chopaticks");
					synchronized (kinfeAndFork) {
						System.out.println(Thread.currentThread().getName()+"---else---kinfeAndFork");	
					}
				}
			}
		}
	}
}
public class Thread_test14 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		DeadLockThread thread1=new DeadLockThread(true);
		DeadLockThread thread2=new DeadLockThread(false);
		new Thread(thread1,"Chinese").start();
		new Thread(thread2,"Chinese").start();

	}

}
