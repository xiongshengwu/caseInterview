package thread;

public class ThreadTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new T1(),"线程1");
		Thread t2 = new Thread(new T2(),"线程2");
		Thread t3 = new Thread(new T3(),"线程3");
		
		try {
			t1.start();
			t2.start();
			t2.join();
			t3.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class T1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("我是线程T1");
	}
}
class T2 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("我是线程T2");
	}
}
class T3 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("我是线程T3");
	}
}
